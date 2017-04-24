<?xml version="1.0" encoding="utf-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <xsl:element name="company">
            <xsl:for-each select="//emp">
                <xsl:element name="employee">
                    <xsl:attribute name="id">
                        <xsl:value-of select="@no"/>
                    </xsl:attribute>
                    <name>
                        <xsl:value-of select="@name"/>
                    </name>
                    <xsl:element name="division">
                        <xsl:value-of select="../../@no"/>
                    </xsl:element>
                </xsl:element>
            </xsl:for-each>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>