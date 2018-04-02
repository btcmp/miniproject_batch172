package org.apache.jsp.WEB_002dINF.pages.account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class account_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/pages/modal/update-account.html");
    _jspx_dependants.add("/WEB-INF/pages/modal/add-account.html");
    _jspx_dependants.add("/WEB-INF/pages/modal/add-role.html");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/img/apple-icon.png\" />\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/img/favicon.png\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("    <title>Material Dashboard by Creative Tim</title>\n");
      out.write("    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("    <meta name=\"_csrf\" content=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("    <!-- default header name is X-CSRF-TOKEN -->\n");
      out.write("    <meta name=\"_csrf_header\" content=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.headerName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("    <!-- Bootstrap core CSS     -->\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <!--  Material Dashboard CSS    -->\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/css/material-dashboard.css?v=1.2.0\" rel=\"stylesheet\" />\n");
      out.write("    <!--  CSS for Demo Purpose, don't include it in your project     -->\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("    <!--     Fonts and icons     -->\n");
      out.write("    <link href=\"https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300|Material+Icons' rel='stylesheet' type='text/css'>\n");
      out.write("\t<style>\n");
      out.write("\t\tinput.parsley-error\n");
      out.write("\t\t{\n");
      out.write("\t\t  color: #B94A48 !important;\n");
      out.write("\t\t  background-color: #F2DEDE !important;\n");
      out.write("\t\t  border: 1px solid #EED3D7 !important;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <div class=\"sidebar\" data-color=\"purple\" data-image=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/img/sidebar-1.jpg\">\n");
      out.write("            <!--\n");
      out.write("        Tip 1: You can change the color of the sidebar using: data-color=\"purple | blue | green | orange | red\"\n");
      out.write("\n");
      out.write("        Tip 2: you can also add an image using data-image tag\n");
      out.write("    -->\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"http://www.creative-tim.com\" class=\"simple-text\">\n");
      out.write("                    Bank Mega\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sidebar-wrapper\">\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li class=\"active\">\n");
      out.write("                        <a href=\"dashboard.html\">\n");
      out.write("                            <i class=\"material-icons\">dashboard</i>\n");
      out.write("                            <p>Dashboard</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                     <li>\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/department\">\n");
      out.write("                            <i class=\"material-icons\">library_books</i>\n");
      out.write("                            <p>Department</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/employee\">\n");
      out.write("                             <i class=\"material-icons\">bubble_chart</i>\n");
      out.write("                            <p>Employee</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/account\">\n");
      out.write("                            <i class=\"material-icons\">person</i>\n");
      out.write("                            <p>User Account</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\" id=\"logout\">\n");
      out.write("                            <i class=\"material-icons\">block</i>\n");
      out.write("                            <p>Logout</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logoutUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"post\" id=\"logoutForm\">\n");
      out.write("\t\t\t\t\t  <input type=\"hidden\"\n");
      out.write("\t\t\t\t\t\tname=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-panel\">\n");
      out.write("            <nav class=\"navbar navbar-primary navbar-absolute\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\"> User Account Management </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"collapse navbar-collapse\">\n");
      out.write("                        \n");
      out.write("                        <form class=\"navbar-form navbar-right\" role=\"search\">\n");
      out.write("                            <div class=\"form-group  is-empty\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                                <span class=\"material-input\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-white btn-round btn-just-icon\">\n");
      out.write("                                <i class=\"material-icons\">search</i>\n");
      out.write("                                <div class=\"ripple-container\"></div>\n");
      out.write("                            </button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-12\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-header\" data-background-color=\"orange\">\n");
      out.write("                                    <h4 class=\"title\">User Role</h4>\n");
      out.write("                                    <p class=\"category\">\n");
      out.write("                                    <a id=\"btn-add-account\" class=\"btn btn-info btn-sm\">Add user and role</a></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-content table-responsive\">\n");
      out.write("                                    <table id=\"table-user\" class=\"table table-hover\">\n");
      out.write("                                        <thead class=\"text-warning\">\n");
      out.write("                                            <th>Username</th>\n");
      out.write("                                            <th>Email</th>\n");
      out.write("                                            <th>Status</th>\n");
      out.write("                                            <th>Role</th>\n");
      out.write("                                            <th>Detail</th>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-6 col-md-12\">\n");
      out.write("                            <div class=\"card card-nav-tabs\">\n");
      out.write("                                <div class=\"card-header\" data-background-color=\"purple\">\n");
      out.write("                                    <div class=\"nav-tabs-navigation\">\n");
      out.write("                                        <div class=\"nav-tabs-wrapper\">\n");
      out.write("                                            <span class=\"nav-tabs-title\">List Roles</span>\n");
      out.write("                                            <ul class=\"nav nav-tabs\" data-tabs=\"tabs\">\n");
      out.write("                                                <li class=\"active\">\n");
      out.write("                                                    <a id=\"btn-add-role\" href=\"#profile\" data-toggle=\"tab\">\n");
      out.write("                                                        ");
      out.write("\n");
      out.write("                                                        Add Role\n");
      out.write("                                                    </a>\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-content\">\n");
      out.write("                                    <div class=\"tab-content\">\n");
      out.write("                                        <div class=\"tab-pane active\" id=\"profile\">\n");
      out.write("                                            <table class=\"table\" id=\"role-table\">\n");
      out.write("                                            \t<thead>\n");
      out.write("                                            \t\t<tr>\n");
      out.write("                                            \t\t\t<td>Role Name</td>\n");
      out.write("                                            \t\t</tr>\n");
      out.write("                                            \t</thead>\n");
      out.write("                                            \t<tbody>\n");
      out.write("                                            \t\t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            \t</tbody>\n");
      out.write("                                            </table>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <nav class=\"pull-left\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    Home\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    Company\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    Portfolio\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    Blog\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                    <p class=\"copyright pull-right\">\n");
      out.write("                        &copy;\n");
      out.write("                        <script>\n");
      out.write("                            document.write(new Date().getFullYear())\n");
      out.write("                        </script>\n");
      out.write("                        <a href=\"http://www.creative-tim.com\">Creative Tim</a>, made with love for a better web\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"modal-edit-account-view-detail\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Edit Penjualan</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <form action=\"#\">\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t  <input type=\"hidden\" id=\"idEdit\" name=\"idEdit\" />\n");
      out.write("\t\t\t    <label for=\"user.username\">Username</label>\n");
      out.write("\t\t\t    <input type=\"text\" name=\"user.username\" class=\"form-control\" id=\"username\" aria-describedby=\"nameHelp\" placeholder=\"Enter Your Username\">\n");
      out.write("\t\t\t    <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your username with anyone else.</small>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"user.email\">Email</label>\n");
      out.write("\t\t\t    <input type=\"text\" name=\"user.email\" class=\"form-control\" id=\"totalPenjualan\" aria-describedby=\"emailHelp\" placeholder=\"Enter Your Email\">\n");
      out.write("\t\t\t    <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"user.email\">Status</label>\n");
      out.write("\t\t\t  \t<div class=\"togglebutton\">\n");
      out.write("\t\t\t\t\t<label>\n");
      out.write("\t\t\t\t    \t<input id=\"statusUser\" type=\"checkbox\" >\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"listRoles\">Role</label><br/>\n");
      out.write("\t\t\t    <select style=\"width: 100%;\" name=\"roles\" id=\"listRoles\" multiple=\"multiple\">\n");
      out.write("\t\t      \t\t  ");
      if (_jspx_meth_c_005fforEach_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t      \t</select>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t \n");
      out.write("\t\t  </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button type=\"button\" id=\"btn-edit\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("    ");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"add-account-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\">Add Account User</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <form id=\"form-add-account\" action=\"#\">\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"add.user.username\">Username</label>\n");
      out.write("\t\t\t    <input data-parsley-required=\"true\" type=\"email\" name=\"add.user.username\" class=\"form-control\" id=\"username\" aria-describedby=\"nameHelp\" placeholder=\"Enter Your Username\">\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"add.user.password\">Password</label>\n");
      out.write("\t\t\t    <input data-parsley-required=\"true\" type=\"password\" name=\"add.user.password\" class=\"form-control\" id=\"add.user.password\" aria-describedby=\"emailHelp\" placeholder=\"Enter Your Password\">\n");
      out.write("\t\t\t </div>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"add.user.email\">Email</label>\n");
      out.write("\t\t\t    <input data-parsley-required=\"true\" type=\"email\" name=\"add.user.email\" class=\"form-control\" id=\"add.user.email\" aria-describedby=\"emailHelp\" placeholder=\"Enter Your Email\">\n");
      out.write("\t\t\t </div>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"user.email\">Status</label>\n");
      out.write("\t\t\t  \t<div class=\"togglebutton\">\n");
      out.write("\t\t\t\t\t<label>\n");
      out.write("\t\t\t\t    \t<input id=\"add-statusUser\" type=\"checkbox\" >\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"add.listRoles\">Role</label><br/>\n");
      out.write("\t\t\t    <select style=\"width: 100%;\" name=\"add.roles\" id=\"add-listRoles\" multiple=\"multiple\">\n");
      out.write("\t\t      \t\t  ");
      if (_jspx_meth_c_005fforEach_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t      \t</select>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t \n");
      out.write("\t\t  </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button type=\"button\" id=\"btn-add-account-submit\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("    ");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"add-role-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\">Add Account User</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <form id=\"form-add-role\" action=\"#\">\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"role-name\">Role</label>\n");
      out.write("\t\t\t    <input data-parsley-required=\"true\" type=\"text\" name=\"role-name\" class=\"form-control\" id=\"role-name\" aria-describedby=\"nameHelp\" placeholder=\"Enter Role Name\">\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t  </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button type=\"button\" id=\"btn-add-role-submit\" class=\"btn btn-primary\">Add Role</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("</body>\n");
      out.write("<!--   Core JS Files   -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/material.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<!--  Charts Plugin -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/chartist.min.js\"></script>\n");
      out.write("<!--  Dynamic Elements plugin -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/arrive.min.js\"></script>\n");
      out.write("<!--  PerfectScrollbar Library -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("<!--  Notifications Plugin    -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/bootstrap-notify.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js\"></script>\n");
      out.write("<!-- Material Dashboard javascript methods -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/material-dashboard.js?v=1.2.0\"></script>\n");
      out.write("<script src=\"https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js\" />\n");
      out.write("<script src=\"https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js\" />\n");
      out.write("<!-- Material Dashboard DEMO methods, don't include it in your project! -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/assets/js/demo.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function() {\n");
      out.write("    \t\n");
      out.write("    \t function ajaxSetUp(){\n");
      out.write("    \t\t var token = $(\"meta[name='_csrf']\").attr(\"content\");\n");
      out.write("    \t\t  var header = $(\"meta[name='_csrf_header']\").attr(\"content\");\n");
      out.write("    \t\t  $(document).ajaxSend(function(e, xhr, options) {\n");
      out.write("    \t\t    xhr.setRequestHeader(header, token);\n");
      out.write("    \t\t  });\n");
      out.write("    \t }\n");
      out.write("    \t \n");
      out.write("    \t $('#table-user').DataTable();\n");
      out.write("    \t $('#role-table').DataTable();\n");
      out.write("     \n");
      out.write("    \t // Javascript method's body can be found in assets/js/demos.js\n");
      out.write("    \t $('.view-detail').on('click', function(){\n");
      out.write("    \t\t var id = $(this).attr('id');\n");
      out.write("    \t\t $(this).removeAttr(\"checked\");\t \n");
      out.write("    \t\t $.ajax({\n");
      out.write("    \t\t\t url: 'account/user/'+id,\n");
      out.write("    \t\t\t type: 'GET',\n");
      out.write("    \t\t\t beforeSend: function(){\n");
      out.write("    \t\t\t\tajaxSetUp(); \n");
      out.write("    \t\t\t },\n");
      out.write("    \t\t\t success: function(data){\n");
      out.write("    \t\t\t\t console.log(data);\n");
      out.write("    \t\t\t\t $(\"select[name='roles'] option:selected\").prop(\"selected\", false)\n");
      out.write("    \t\t\t\t $('#idEdit').val(data.id);\n");
      out.write("    \t\t\t\t $('input[name=\"user.username\"]').val(data.username);\n");
      out.write("    \t\t\t\t $('input[name=\"user.email\"]').val(data.email);\n");
      out.write("    \t\t\t\t \n");
      out.write("    \t\t\t\t if(data.enabled == 1){\n");
      out.write("    \t\t\t\t\t$('#statusUser').attr(\"checked\",\"\");\t \n");
      out.write("    \t\t\t\t } \n");
      out.write("    \t\t\t\t \n");
      out.write("    \t\t\t\t $.each(data.roles, function(index, value){ \n");
      out.write("    \t\t\t\t\t  $(\"select[name='roles'] option[value='\" + value.id + \"']\").prop(\"selected\", true);\n");
      out.write("    \t\t\t\t });\n");
      out.write("    \t\t\t }\n");
      out.write("    \t\t });\n");
      out.write("         \t$('#modal-edit-account-view-detail').modal();\n");
      out.write("         });\n");
      out.write("    \t \n");
      out.write("    \t $(\"#statusUser\").on(\"click\", function(){\n");
      out.write("    \t\t var attr = $(this).attr('checked');\n");
      out.write("    \t\t if (typeof attr !== typeof undefined && attr !== false) {\n");
      out.write("    \t\t\t $(this).removeAttr(\"checked\");\t    \n");
      out.write("    \t\t } else {\n");
      out.write("    \t\t\t $(this).attr(\"checked\", \"\");\n");
      out.write("    \t\t }\n");
      out.write("    \t });\n");
      out.write("    \t \n");
      out.write("    \t $(\"#add-statusUser\").on(\"click\", function(){\n");
      out.write("    \t\t var attr = $(this).attr('checked');\n");
      out.write("    \t\t if (typeof attr !== typeof undefined && attr !== false) {\n");
      out.write("    \t\t\t $(this).removeAttr(\"checked\");\t    \n");
      out.write("    \t\t } else {\n");
      out.write("    \t\t\t $(this).attr(\"checked\", \"\");\n");
      out.write("    \t\t }\n");
      out.write("    \t });\n");
      out.write("    \t \n");
      out.write("    \t $('#btn-edit').on('click', function(){\n");
      out.write("    \t\t var attr = $(\"#statusUser\").attr('checked');\n");
      out.write("    \t\t var enable = 0;\n");
      out.write("    \t\t if (typeof attr !== typeof undefined && attr !== false) {\n");
      out.write("    \t\t\t enable = 1;\n");
      out.write("    \t\t }\n");
      out.write("    \t\t var user = {\n");
      out.write("    \t\t\t\tid : $('#idEdit').val(),\n");
      out.write("    \t\t\t\tusername : $('input[name=\"user.username\"]').val(),\n");
      out.write("    \t\t\t\temail : $('input[name=\"user.email\"]').val(),\n");
      out.write("    \t\t\t\tenabled : enable,\n");
      out.write("    \t\t\t\troles : []\n");
      out.write("    \t\t }\n");
      out.write("    \t\t \n");
      out.write("    \t\t $.each($('#listRoles').val(), function(index, val){\n");
      out.write("    \t\t\t var role = {\n");
      out.write("    \t\t\t\tid : val\n");
      out.write("    \t\t\t }\n");
      out.write("    \t\t\t user.roles.push(role);\n");
      out.write("    \t\t });\n");
      out.write("    \t\t\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\t url : 'account/updaterole',\n");
      out.write("\t\t\t\t type: 'PUT', \n");
      out.write("\t\t\t\t contentType: 'application/json',\n");
      out.write("\t\t\t\t data : JSON.stringify(user),\n");
      out.write("\t\t\t\t success: function(data){\n");
      out.write("\t\t\t\t\t window.location = \"account\";\n");
      out.write("\t\t\t\t }\n");
      out.write("\t\t\t });\n");
      out.write("    \t });\n");
      out.write("    \t \n");
      out.write("    \t $('#btn-add-account').on('click', function(){\n");
      out.write("    \t\t $(\"#add-account-modal\").modal();\n");
      out.write("    \t });\n");
      out.write("    \t //validation form\n");
      out.write("    \t $('#btn-add-account-submit').click(function(){\n");
      out.write("    \t\t var validate = $('#form-add-account').parsley();\n");
      out.write("    \t\t \n");
      out.write("        \t validate.validate();\n");
      out.write("        \t if(validate.isValid()){\n");
      out.write("        \t \t//do next code..\n");
      out.write("        \t \t var attr = $(\"#add-statusUser\").attr('checked');\n");
      out.write("\t    \t\t var enable = 0;\n");
      out.write("\t    \t\t if (typeof attr !== typeof undefined && attr !== false) {\n");
      out.write("\t    \t\t\t enable = 1;\n");
      out.write("\t    \t\t }\n");
      out.write("\t    \t\t \n");
      out.write("        \t\t var user = {\n");
      out.write("         \t\t\t\tusername : $('input[name=\"add.user.username\"]').val(),\n");
      out.write("         \t\t\t\temail : $('input[name=\"add.user.email\"]').val(),\n");
      out.write("         \t\t\t\tpassword: $('input[name=\"add.user.password\"]').val(),\n");
      out.write("         \t\t\t\tenabled : enable,\n");
      out.write("         \t\t\t\troles : []\n");
      out.write("         \t\t }\n");
      out.write("         \t\t \n");
      out.write("         \t\t $.each($('#add-listRoles').val(), function(index, val){\n");
      out.write("         \t\t\t var role = {\n");
      out.write("         \t\t\t\tid : val\n");
      out.write("         \t\t\t }\n");
      out.write("         \t\t\t user.roles.push(role);\n");
      out.write("         \t\t });\n");
      out.write("\t    \t\t \n");
      out.write("        \t\t $.ajax({\n");
      out.write("        \t\t\t url : \"account/save/\",\n");
      out.write("        \t\t\t type: 'POST',\n");
      out.write("        \t\t\t beforeSend: function(){\n");
      out.write("        \t\t\t\t ajaxSetUp();\n");
      out.write("        \t\t\t },\n");
      out.write("        \t\t\t contentType: 'application/json',\n");
      out.write("        \t\t\t data : JSON.stringify(user),\n");
      out.write("        \t\t\t error: function(){\n");
      out.write("        \t\t\t\t alert(\"create user failed!\");\n");
      out.write("        \t\t\t },\n");
      out.write("        \t\t\t success: function(data){\n");
      out.write("        \t\t\t\t window.location = \"account\";\n");
      out.write("        \t\t\t }\n");
      out.write("        \t\t });\n");
      out.write("        \t } \n");
      out.write("    \t });\n");
      out.write("    \t \n");
      out.write("    \t $('#btn-add-role').on('click', function(){\n");
      out.write("    \t\t $('#add-role-modal').modal();\n");
      out.write("    \t });\n");
      out.write("    \t \n");
      out.write("    \t $('#btn-add-role-submit').on('click', function(){\n");
      out.write("    \t\t var validate = $('#form-add-role').parsley();\n");
      out.write("    \t\t if(validate.validate()){\n");
      out.write("    \t\t\tvar role = {\n");
      out.write("    \t\t\t\troleName : $('#role-name').val(),\n");
      out.write("    \t\t\t}\n");
      out.write("    \t\t\tajaxSetUp();\n");
      out.write("    \t\t\t$.ajax({\n");
      out.write("    \t\t\t\turl: 'account/addrole',\n");
      out.write("    \t\t\t\ttype: 'POST',\n");
      out.write("    \t\t\t\tdata: JSON.stringify(role),\n");
      out.write("    \t\t\t\tcontentType: 'application/json',\n");
      out.write("    \t\t\t\tsuccess: function(data){\n");
      out.write("    \t\t\t\t\tconsole.log(data);\n");
      out.write("    \t\t\t\t}\n");
      out.write("    \t\t\t});\n");
      out.write("    \t\t }\n");
      out.write("    \t\t \n");
      out.write("    \t });\n");
      out.write("    \t \n");
      out.write("    \t//logout event button\n");
      out.write("    \t $('#logout').click(function(event){\n");
      out.write("    \t\t event.preventDefault();\n");
      out.write("    \t\t$('#logoutForm').submit();\n");
      out.write("    \t });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/pages/account/account.jsp(3,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/j_spring_security_logout");
    // /WEB-INF/pages/account/account.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("logoutUrl");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/pages/account/account.jsp(138,44) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("user");
    // /WEB-INF/pages/account/account.jsp(138,44) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/account/account.jsp(138,44) '${users }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${users }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            \t<tr>\n");
          out.write("                                            \t\t<td>");
          if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\n");
          out.write("                                            \t\t<td>");
          if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\n");
          out.write("                                            \t\t<td>\n");
          out.write("                                            \t\t");
          if (_jspx_meth_c_005fchoose_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\n");
          out.write("                                            \t</td>\n");
          out.write("                       \t\t\t\t\t\t\t<td>\n");
          out.write("                       \t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\n");
          out.write("                       \t\t\t\t\t\t\t</td>\n");
          out.write("                       \t\t\t\t\t\t\t<td>\n");
          out.write("                       \t\t\t\t\t\t\t\t<a id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"btn btn-sm btn-primary view-detail\" href=\"#\">View Detail</a>\n");
          out.write("                       \t\t\t\t\t\t\t</td>\n");
          out.write("                                            \t</tr>\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/pages/account/account.jsp(140,50) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username }", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/pages/account/account.jsp(141,50) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email }", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            \t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\n");
        out.write("                                            \t\t\t");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\n");
        out.write("                                            \t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/pages/account/account.jsp(144,47) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.enabled == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            \t\t\t\tActive\n");
        out.write("                                            \t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/pages/account/account.jsp(147,47) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.enabled == 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            \t\t\t\tNot Active\n");
        out.write("                                            \t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/pages/account/account.jsp(153,31) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("role");
    // /WEB-INF/pages/account/account.jsp(153,31) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/account/account.jsp(153,31) '${user.roles }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${user.roles }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                       \t\t\t\t\t\t\t\t\t<div><a href=\"#\">");
          if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("</a></div>\n");
          out.write("                       \t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/pages/account/account.jsp(154,49) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.roleName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /WEB-INF/pages/account/account.jsp(194,46) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("role");
    // /WEB-INF/pages/account/account.jsp(194,46) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/account/account.jsp(194,46) '${roles }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${roles }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            \t\t<tr>\n");
          out.write("                                            \t\t\t<td>");
          if (_jspx_meth_c_005fout_005f3(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write("</td>\n");
          out.write("                                            \t\t</tr>\n");
          out.write("                                            \t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    // /WEB-INF/pages/account/account.jsp(196,51) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.roleName }", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent(null);
    // /WEB-INF/pages/modal/update-account.html(35,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("role");
    // /WEB-INF/pages/modal/update-account.html(35,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/modal/update-account.html(35,12) '${roles }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${roles }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t      \t\t  \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("\t\t      \t\t  \t\t");
          if (_jspx_meth_c_005fout_005f4(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write("\n");
          out.write("\t\t      \t\t  \t</option>\n");
          out.write("\t\t      \t\t  ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/pages/modal/update-account.html(37,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.roleName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
    if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent(null);
    // /WEB-INF/pages/modal/add-account.html(36,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setVar("role");
    // /WEB-INF/pages/modal/add-account.html(36,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/modal/add-account.html(36,12) '${roles }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${roles }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t      \t\t  \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("\t\t      \t\t  \t\t");
          if (_jspx_meth_c_005fout_005f5(_jspx_th_c_005fforEach_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
            return true;
          out.write("\n");
          out.write("\t\t      \t\t  \t</option>\n");
          out.write("\t\t      \t\t  ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f4.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f4);
    // /WEB-INF/pages/modal/add-account.html(38,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role.roleName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
    if (_jspx_th_c_005fout_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
    return false;
  }
}
