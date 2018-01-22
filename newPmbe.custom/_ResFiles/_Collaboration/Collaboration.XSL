<?xml version="1.0" encoding="gb2312" ?> 
<xsl:stylesheet xmlns:xsl="http://www.w3.org/TR/WD-xsl" 
xmlns="http://www.w3.org/TR/REC-html40"> 
<xsl:template> 
<xsl:apply-templates/> 
</xsl:template> 
  
<xsl:template match="/"> 
<HTML> 
<HEAD> 
<TITLE>协同关系表</TITLE> 
<STYLE> 
CAPTION{font-size:15pt; font-weight:bold; color:blue } 
</STYLE> 
</HEAD> 
<BODY> 
<xsl:apply-templates select="CollaborationReport"/> 
</BODY> 
</HTML> 
</xsl:template> 
<xsl:template match="CollaborationReport"> 
<!--协同关系表数据  begin-->
<TABLE BORDER="1" align="center"> 
<xsl:for-each select="WholeReport"> 
<CAPTION>协同关系表</CAPTION> 
<THEAD> 
<TD> <B>活 动 名 称</B> </TD> 
<TD> <B>角 色</B> </TD> 
<TD> <B>设 备 类 型</B> </TD> 
<TD> <B>场 所 类 型</B> </TD>
<TD> <B>组 织 机 构</B> </TD>
</THEAD> 
<xsl:for-each select="ColData"> 
<TR> 
<TD align="left"><xsl:value-of select="Act"/></TD> 
<TD align="left"><xsl:value-of select="Roles"/></TD> 
<TD align="left"><xsl:value-of select="MachineTypes"/></TD>
<TD align="left"><xsl:value-of select="LocationTypes"/></TD> 
<TD align="left"><xsl:value-of select="ResourceGroups"/></TD> 
</TR> 
</xsl:for-each>
</xsl:for-each> 
</TABLE> 
<!--协同关系表数据  end-->

</xsl:template>
</xsl:stylesheet> 
