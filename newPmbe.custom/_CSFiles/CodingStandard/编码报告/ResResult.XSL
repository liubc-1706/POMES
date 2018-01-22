<?xml version="1.0" encoding="gb2312" ?> 
<xsl:stylesheet xmlns:xsl="http://www.w3.org/TR/WD-xsl" 
xmlns="http://www.w3.org/TR/REC-html40"> 
<xsl:template> 
<xsl:apply-templates/> 
</xsl:template> 
  
<xsl:template match="/"> 
<HTML> 
<HEAD> 
<TITLE>标准编码报告</TITLE> 
<STYLE> 
CAPTION{font-size:15pt; font-weight:bold; color:blue } 
</STYLE> 
</HEAD> 
<BODY> 
<xsl:apply-templates select="CodingReport"/> 
</BODY> 
</HTML> 
</xsl:template> 

<xsl:template match="CodingReport"> 

<!--AbsLocation  begin-->
<TABLE BORDER="1"> 
<xsl:for-each select="AbsLocationList"> 
<CAPTION>抽象场所编码列表</CAPTION> 
<THEAD> 
<TD width="300"> <B>抽象场所名称</B> </TD> 
<TD width="400"> <B>编码</B> </TD> 
</THEAD> 
<xsl:for-each select="AbsLocation"> 
<TR> 
<TD align="left"><xsl:value-of select="Name"/></TD> 
<TD align="left"><xsl:value-of select="Code"/></TD> 
</TR> 
</xsl:for-each> 
</xsl:for-each> 
</TABLE> 
<!--AbsLocation  end-->

<!--AbsTool  begin-->
<TABLE BORDER="1"> 
<xsl:for-each select="AbsToolList"> 
<CAPTION>抽象工具编码列表</CAPTION> 
<THEAD> 
<TD width="300"> <B>抽象工具名称</B> </TD> 
<TD width="400"> <B>编码</B> </TD> 
</THEAD> 
<xsl:for-each select="AbsTool"> 
<TR> 
<TD align="left"><xsl:value-of select="Name"/></TD> 
<TD align="left"><xsl:value-of select="Code"/></TD> 
</TR> 
</xsl:for-each> 
</xsl:for-each> 
</TABLE> 
<!--AbsTool end-->

<!--AbsMachine  begin-->
<TABLE BORDER="1"> 
<xsl:for-each select="AbsMachineList"> 
<CAPTION>抽象机器编码列表</CAPTION> 
<THEAD> 
<TD width="300"> <B>抽象机器名称</B> </TD> 
<TD width="400"> <B>编码</B> </TD> 
</THEAD> 
<xsl:for-each select="AbsMachine"> 
<TR> 
<TD align="left"><xsl:value-of select="Name"/></TD> 
<TD align="left"><xsl:value-of select="Code"/></TD> 
</TR> 
</xsl:for-each> 
</xsl:for-each> 
</TABLE> 
<!--AbsMachine end-->

<!--Location  begin-->
<TABLE BORDER="1"> 
<xsl:for-each select="LocationList"> 
<CAPTION>场所编码列表</CAPTION> 
<THEAD> 
<TD width="300"> <B>场所名称</B> </TD> 
<TD width="400"> <B>编码</B> </TD> 
</THEAD> 
<xsl:for-each select="Location"> 
<TR> 
<TD align="left"><xsl:value-of select="Name"/></TD> 
<TD align="left"><xsl:value-of select="Code"/></TD> 
</TR> 
</xsl:for-each> 
</xsl:for-each> 
</TABLE> 
<!--Location   end-->

<!--Tool begin-->
<TABLE BORDER="1"> 
<xsl:for-each select="ToolList"> 
<CAPTION>工具编码列表</CAPTION> 
<THEAD> 
<TD width="300"> <B>工具名称</B> </TD> 
<TD width="400"> <B>编码</B> </TD> 
</THEAD> 
<xsl:for-each select="Tool"> 
<TR> 
<TD align="left"><xsl:value-of select="Name"/></TD> 
<TD align="left"><xsl:value-of select="Code"/></TD> 
</TR> 
</xsl:for-each> 
</xsl:for-each> 
</TABLE> 
<!--Tool   end-->

<!--Machine  begin-->
<TABLE BORDER="1"> 
<xsl:for-each select="MachineList"> 
<CAPTION>机器编码列表</CAPTION> 
<THEAD> 
<TD width="300"> <B>机器名称</B> </TD> 
<TD width="400"> <B>编码</B> </TD> 
</THEAD> 
<xsl:for-each select="Machine "> 
<TR> 
<TD align="left"><xsl:value-of select="Name"/></TD> 
<TD align="left"><xsl:value-of select="Code"/></TD> 
</TR> 
</xsl:for-each> 
</xsl:for-each> 
</TABLE> 
<!--Machine  end-->

</xsl:template>
</xsl:stylesheet> 
