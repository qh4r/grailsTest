import grails.plugins.metadata.GrailsPlugin
import org.grails.gsp.compiler.transform.LineNumber
import org.grails.gsp.GroovyPage
import org.grails.web.taglib.*
import org.grails.taglib.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_grailsTest_templates__fields_table_gsp extends org.grails.gsp.GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/templates/_fields/_table.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int i = 0
for( p in (domainProperties) ) {
printHtmlPart(1)
createTagBody(2, {->
expressionOut.print(domainClass.propertyName)
printHtmlPart(2)
expressionOut.print(p.name)
printHtmlPart(3)
})
invokeTag('set','g',6,['var':("propTitle")],2)
printHtmlPart(4)
expressionOut.print(message(code: propTitle, default: p.naturalName))
printHtmlPart(5)
i++
}
}
printHtmlPart(6)
loop:{
int i = 0
for( bean in (collection) ) {
printHtmlPart(7)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(8)
loop:{
int j = 0
for( p in (domainProperties) ) {
printHtmlPart(1)
if(true && (j==0)) {
printHtmlPart(9)
createTagBody(4, {->
invokeTag('display','f',16,['bean':(bean),'property':(p.name),'displayStyle':(displayStyle?:'table')],-1)
})
invokeTag('link','g',16,['method':("GET"),'resource':(bean)],4)
printHtmlPart(10)
}
else {
printHtmlPart(9)
invokeTag('display','f',19,['bean':(bean),'property':(p.name),'displayStyle':(displayStyle?:'table')],-1)
printHtmlPart(10)
}
printHtmlPart(11)
j++
}
}
printHtmlPart(12)
i++
}
}
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1506620395000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
