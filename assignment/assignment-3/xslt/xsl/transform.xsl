<?xml version="1.0" encoding="utf-8" ?>
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:tns="http://jw.nju.edu.cn/schema"
                xmlns:nju="http://www.nju.edu.cn/schema">
    <xsl:output indent="yes"/>
    <xsl:template match="/">

        <xsl:element name="tns:scoreList">

            <xsl:for-each select="/tns:studentList/tns:student/tns:courseList/tns:course/tns:scoreList/tns:score">
                <xsl:sort select="../../@courseId"/>
                <xsl:sort select="tns:scoreValue"/>
                <xsl:element name="tns:courseScore">
                    <xsl:attribute name="courseId">
                        <xsl:value-of select="../../@courseId"/>
                    </xsl:attribute>
                    <xsl:attribute name="scoreType">
                        <xsl:value-of select="tns:scoreType"/>
                    </xsl:attribute>

                    <xsl:element name="tns:score">
                        <!--<xsl:element name="studentName">-->
                            <!--<xsl:value-of select="ancestor::node()/nju:personInfo/nju:name"/>-->
                        <!--</xsl:element>-->
                        <xsl:element name="tns:studentId">
                            <xsl:value-of select="ancestor::tns:student/@studentId"/>
                        </xsl:element>
                        <xsl:element name="tns:studentScore">
                            <xsl:value-of select="tns:scoreValue"/>
                        </xsl:element>
                    </xsl:element>
                </xsl:element>
            </xsl:for-each>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>