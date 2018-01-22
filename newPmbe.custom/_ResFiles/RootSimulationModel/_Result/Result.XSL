<?xml version="1.0" encoding="gb2312" ?> 
<xsl:stylesheet xmlns:xsl="http://www.w3.org/TR/WD-xsl" 
xmlns="http://www.w3.org/TR/REC-html40"> 
<xsl:template> 
<xsl:apply-templates/> 
</xsl:template> 
  
<xsl:template match="/"> 
<HTML> 
<HEAD> 
<TITLE>过程模拟报告</TITLE> 
<STYLE> 
CAPTION{font-size:15pt; font-weight:bold; color:blue } 
</STYLE> 
</HEAD> 
<BODY> 
<xsl:apply-templates select="SimulationReport"/> 
</BODY> 
</HTML> 
</xsl:template> 
<!--模拟总报告  begin-->  
<xsl:template match="SimulationReport"> 
<TABLE BORDER="1"> 
<xsl:for-each select="WholeReport"> 
<CAPTION>模拟总报告</CAPTION> 
<THEAD> 
<tr>
	<th>
	     <TD> <B>缺省活动执行时间</B> </TD> 
	     <TD align="right"><xsl:value-of select="DeActPerformTime"/></TD> 
    </th>
</tr>
<tr>
	<th>
	     <TD> <B>缺省概率分布</B> </TD> 
	     <TD align="right"><xsl:value-of select = "DeProbDis"/></TD> 
   </th>
</tr>
<tr>
	<th>
	     <TD> <B>时间单位</B> </TD> 
	     <TD align="right"><xsl:value-of select = "TimeUnit"/></TD> 
   </th>
</tr>
<tr>
	<th>
	     <TD> <B>模拟运行时间</B> </TD> 
	     <TD align="right"><xsl:value-of select = "SimExeDuration"/></TD> 
   </th>
</tr>
<tr>
	<th>
	     <TD> <B>总活动数</B> </TD> 
	     <TD align="right"><xsl:value-of select = "ActCount"/></TD> 
   </th>
</tr>
<tr>
	<th>
	     <TD> <B>激活的活动数</B> </TD> 
	     <TD align="right"><xsl:value-of select = "EnabledActCount"/></TD> 
   </th>
</tr>
<tr>
	<th>
	     <TD> <B>有效时间费用(元)</B> </TD> 
	     <TD align="right"><xsl:value-of select = "AvaTimeCost"/></TD> 
   </th>
</tr>
<tr>
	<th>
	     <TD> <B>空闲时间费用(元)</B> </TD> 
	     <TD align="right"><xsl:value-of select = "VacTimeCost"/></TD> 
   </th>
</tr>
<tr>
	<th>
	     <TD> <B>总费用(元)</B> </TD> 
	     <TD align="right"><xsl:value-of select = "AllCost"/></TD> 
   </th>
</tr>
</THEAD> 
</xsl:for-each> 
</TABLE> 
<!--模拟总报告  end-->

<!--产品统计数据  begin-->
<TABLE BORDER="1"> 
<xsl:for-each select="ProdResult"> 
<CAPTION>产品统计数据</CAPTION> 
<THEAD> 
<TD> <B>产品名称</B> </TD> 
<TD> <B>输入或输出</B> </TD> 
<TD> <B>总数</B> </TD> 
<TD> <B>到达间隔概率分布</B> </TD>
<TD> <B>到达间隔均值</B> </TD>
<TD> <B>到达间隔标准方差</B> </TD>
<TD> <B>等待时间均值</B> </TD>
<TD> <B>等待时间标准方差</B> </TD>
</THEAD> 
<xsl:for-each select="ProdData"> 
<TR> 
<TD align="left"><xsl:value-of select="ProdName"/></TD> 
<TD align="right"><xsl:value-of select="InOrOut"/></TD> 
<TD align="right"><xsl:value-of select="Count"/></TD>
<xsl:for-each select="ReachInterval">
	<TD align="right"><xsl:value-of select = "ProbDistibution"/></TD>
	<xsl:for-each select="AVGAndSD">
		<TD align="right"><xsl:value-of select="Average"/></TD> 
		<TD align="right"><xsl:value-of select="STDevation"/></TD>
	</xsl:for-each>
</xsl:for-each>
<xsl:for-each select="WaittingTime">
	<TD align="right"><xsl:value-of select="Average"/></TD> 
	<TD align="right"><xsl:value-of select="STDevation"/></TD>
</xsl:for-each>
</TR> 
</xsl:for-each> 
</xsl:for-each> 
</TABLE> 
<!--产品统计数据  end-->

<!--队列统计数据  begin-->
<TABLE BORDER="1"> 
<xsl:for-each select="SeqResult"> 
<CAPTION>队列统计数据</CAPTION> 
<THEAD> 
<TD> <B>队列名称</B> </TD> 
<TD> <B>队长均值</B> </TD> 
<TD> <B>队长标准方差</B> </TD> 
<TD> <B>最大队长</B> </TD>
<TD> <B>等待时间均值</B> </TD>
<TD> <B>等待时间标准方差</B> </TD>
<TD> <B>总输入数</B> </TD>
<TD> <B>总输出数</B> </TD>
<TD> <B>队列中剩余数</B> </TD>
</THEAD> 
<xsl:for-each select="SeqData"> 
<TR> 
<TD align="left"><xsl:value-of select="Name"/></TD> 
<xsl:for-each select="SeqLength">
	<TD align="right"><xsl:value-of select = "Average"/></TD>
	<TD align="right"><xsl:value-of select="STDevation"/></TD>
</xsl:for-each>
<TD align="right"><xsl:value-of select="MaxLength"/></TD>
<xsl:for-each select="WaittingTime">
	<TD align="right"><xsl:value-of select="Average"/></TD> 
	<TD align="right"><xsl:value-of select="STDevation"/></TD>
</xsl:for-each>
<TD align="right"><xsl:value-of select="InputCount"/></TD> 
<TD align="right"><xsl:value-of select="OutputCount"/></TD> 
<TD align="right"><xsl:value-of select="LeftCount"/></TD> 
</TR>
</xsl:for-each>
</xsl:for-each> 
</TABLE> 
<!--队列统计数据  end-->

<!--活动统计数据  begin-->
<TABLE BORDER="1"> 
<xsl:for-each select="ActResult"> 
<CAPTION>活动统计数据</CAPTION> 
<THEAD> 
<TD> <B>活动名称</B> </TD> 
<TD> <B>工作时间（小时）</B> </TD> 
<TD> <B>执行时间概率分布</B> </TD>
<TD> <B>执行时间均值</B> </TD>
<TD> <B>执行时间标准方差</B> </TD>
<TD> <B>等待时间均值</B> </TD>
<TD> <B>等待时间标准方差</B> </TD>
<TD> <B>执行完成次数</B> </TD>
<TD> <B>总费用（元）</B> </TD>
<TD> <B>批处理量均值</B> </TD>
<TD> <B>批处理量标准方差</B> </TD>
</THEAD> 
<xsl:for-each select="ActData"> 
<TR> 
<TD align="left"><xsl:value-of select="Name"/></TD> 
<TD align="right"><xsl:value-of select="WorkDuration"/></TD> 
<xsl:for-each select="ExcuteDuration">
	<TD align="right"><xsl:value-of select = "ProbDistibution"/></TD>
	<xsl:for-each select="AVGAndSD">
		<TD align="right"><xsl:value-of select="Average"/></TD> 
		<TD align="right"><xsl:value-of select="STDevation"/></TD>
	</xsl:for-each>
</xsl:for-each>
<xsl:for-each select="WaittingTime">
	<TD align="right"><xsl:value-of select="Average"/></TD> 
	<TD align="right"><xsl:value-of select="STDevation"/></TD>
</xsl:for-each>
<TD align="right"><xsl:value-of select="ExcuteTimes"/></TD> 
<TD align="right"><xsl:value-of select="AllCost"/></TD> 
<xsl:for-each select="Batch">
	<TD align="right"><xsl:value-of select="Average"/></TD> 
	<TD align="right"><xsl:value-of select="STDevation"/></TD>
</xsl:for-each>
</TR> 
</xsl:for-each> 
</xsl:for-each> 
</TABLE> 
<!--活动统计数据  end-->

<!--资源统计数据  begin-->
<TABLE BORDER="1"> 
<xsl:for-each select="ResResult"> 
<CAPTION>资源统计数据</CAPTION> 
<THEAD> 
<TD> <B>资源分类</B> </TD> 
<TD> <B>资源类型</B> </TD> 
<TD> <B>总数</B> </TD> 
<TD> <B>利用率均值</B> </TD>
<TD> <B>利用率标准方差</B> </TD>
<TD> <B>利用率百分比(%)</B> </TD>
<TD> <B>工作时间均值</B> </TD>
<TD> <B>工作时间标准方差</B> </TD>
<TD> <B>有效工作量</B> </TD>
<TD> <B>空闲费用（元）</B> </TD>
<TD> <B>总费用（元）</B> </TD>
</THEAD> 
<xsl:for-each select="ResData"> 
<TR> 
<TD align="left"><xsl:value-of select="ResClass"/></TD> 
<TD align="right"><xsl:value-of select="ResType"/></TD> 
<TD align="right"><xsl:value-of select="Count"/></TD>
<xsl:for-each select="UsingRate">
	<xsl:for-each select="AVGAndSD">
		<TD align="right"><xsl:value-of select="Average"/></TD> 
		<TD align="right"><xsl:value-of select="STDevation"/></TD>
	</xsl:for-each>
	<TD align="right"><xsl:value-of select = "Percent"/></TD>
</xsl:for-each>
<xsl:for-each select="WorkDuration">
	<TD align="right"><xsl:value-of select="Average"/></TD> 
	<TD align="right"><xsl:value-of select="STDevation"/></TD>
</xsl:for-each>
<TD align="right"><xsl:value-of select="AvaDuration"/></TD> 
<TD align="right"><xsl:value-of select="VacTimeCost"/></TD> 
<TD align="right"><xsl:value-of select="AllCost"/></TD>
</TR> 
</xsl:for-each>
</xsl:for-each> 
</TABLE> 
<!--资源统计数据  end-->

</xsl:template>
</xsl:stylesheet> 
