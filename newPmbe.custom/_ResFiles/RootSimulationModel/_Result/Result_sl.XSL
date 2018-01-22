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
<TABLE BORDER="1" align="center"> 
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

</xsl:template>
</xsl:stylesheet> 
