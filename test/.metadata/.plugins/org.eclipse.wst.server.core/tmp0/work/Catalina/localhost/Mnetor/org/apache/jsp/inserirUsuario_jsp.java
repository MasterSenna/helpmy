/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.93
 * Generated at: 2023-09-25 18:28:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inserirUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Formulário de Cadastro</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h1>Formulário de Cadastro</h1>\r\n");
      out.write("    \r\n");
      out.write("    <form action=\"inserirUsuario\" method=\"post\">\r\n");
      out.write("        <label for=\"nome\">Nome:</label>\r\n");
      out.write("        <input type=\"text\" id=\"nome\" name=\"Nome\" required><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <label for=\"email\">Email:</label>\r\n");
      out.write("        <input type=\"email\" id=\"email\" name=\"Email\" required><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <label for=\"senha\">Senha:</label>\r\n");
      out.write("        <input type=\"password\" id=\"senha\" name=\"Senha\" required><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <label for=\"telefone\">Telefone:</label>\r\n");
      out.write("        <input type=\"tel\" id=\"telefone\" name=\"Telefone\" required><br><br>\r\n");
      out.write("\r\n");
      out.write("        <!-- Campos numéricos -->\r\n");
      out.write("        <label for=\"Programacao\">Programação:</label>\r\n");
      out.write("        <input type=\"number\" id=\"Programacao\" name=\"Programacao\" required><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <label for=\"Redes\">Redes:</label>\r\n");
      out.write("        <input type=\"number\" id=\"Redes\" name=\"Redes\" required><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <label for=\"Ciberseguranca\">Cibersegurança:</label>\r\n");
      out.write("        <input type=\"number\" id=\"Ciberseguranca\" name=\"Ciberseguranca\" required><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Correção dos nomes -->\r\n");
      out.write("        <label for=\"Banco_Dados\">Banco de Dados:</label>\r\n");
      out.write("        <input type=\"number\" id=\"Banco_Dados\" name=\"Banco_Dados\" required><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <label for=\"Business_Intelligence\">Business Intelligence:</label>\r\n");
      out.write("        <input type=\"number\" id=\"Business_Intelligence\" name=\"Business_Intelligence\" required><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Correção do nome -->\r\n");
      out.write("        <label for=\"Gestao_TI\">Gestão de TI:</label>\r\n");
      out.write("        <input type=\"number\" id=\"Gestao_TI\" name=\"gestao_TI\" required><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <label for=\"Cloud_Computing\">Cloud Computing:</label>\r\n");
      out.write("        <input type=\"number\" id=\"Cloud_Computing\" name=\"Cloud_Computing\" required><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <label for=\"DevOps\">DevOps:</label>\r\n");
      out.write("        <input type=\"number\" id=\"DevOps\" name=\"DevOps\" required><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <input type=\"submit\" value=\"Cadastrar\">\r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
