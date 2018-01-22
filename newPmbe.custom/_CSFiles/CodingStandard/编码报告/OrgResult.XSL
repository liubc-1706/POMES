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

<!--GroupType  begin-->
<TABLE BORDER="1"> 
<xsl:for-each select="GroupTypeList"> 
<CAPTION>组织机构编码列表</CAPTION> 
<THEAD> 
<TD width="300"> <B>机构名称</B> </TD> 
<TD width="400"> <B>编码</B> </TD> 
</THEAD> 
<xsl:for-each select="GroupType"> 
<TR> 
<TD align="left"><xsl:value-of select="Name"/></TD> 
<TD align="left"><xsl:value-of select="Code"/></TD> 
</TR> 
</xsl:for-each> 
</xsl:for-each> 
</TABLE> 
<!--GroupType  end-->

<!--Role  begin-->
<!--
<TABLE BORDER="1"> 
<xsl:for-each select="RoleList"> 
<CAPTION>人员编码列表</CAPTION> 
<THEAD> 
<TD width="300"> <B>人员</B> </TD> 
<TD width="400"> <B>编码</B> </TD> 
</THEAD> 
<xsl:for-each select="Role"> 
<TR> 
<TD align="left"><xsl:value-of select="Name"/></TD> 
<TD align="left"><xsl:value-of select="Code"/></TD> 
</TR> 
</xsl:for-each> 
</xsl:for-each> 
</TABLE> 
-->
<!--Role   end-->

</xsl:template>
</xsl:stylesheet> 
