/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-07-06 06:19:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class review_005fdetailview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/Users/hehe/Desktop/WatchDogs_Spring-main/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/WatchDogs_Spring_00/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1624946226581L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write('\n');

    	String userid = (String)session.getAttribute("userid");
    	String usertype = (String)session.getAttribute("usertype");

      out.write("      \n");
      out.write("  \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>후기 상세 페이지</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"http://dmshop.kr/theme/moon/css/default_shop.css?ver=12928\">\n");
      out.write("<link rel=\"stylesheet\" href=\"http://dmshop.kr/theme/moon/skin/shop/basic/style.css?ver=12928\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("th, td {\n");
      out.write("	text-align: center;\n");
      out.write("	padding:5px;\n");
      out.write("	}\n");
      out.write("table{\n");
      out.write("	text-align: center;\n");
      out.write("	margin:0 auto;\n");
      out.write("	border-collapse: collapse;\n");
      out.write("}	\n");
      out.write("a { \n");
      out.write("text-decoration:none \n");
      out.write("} \n");
      out.write(".button{\n");
      out.write("	color:#F5DEB3; \n");
      out.write("	background:#FFA500; \n");
      out.write("	font-size:1em; \n");
      out.write("	border-radius:4px\n");
      out.write("}	\n");
      out.write("textbox{\n");
      out.write("	text-align: left;\n");
      out.write("}\n");
      out.write("#button{\n");
      out.write(" 	margin:auto;\n");
      out.write(" 	width: 100px;\n");
      out.write("	background-color: #f5af46;\n");
      out.write("	line-height:36px;\n");
      out.write(" 	height: 36px;\n");
      out.write(" 	text-align:center;\n");
      out.write(" 	font-size:15px;\n");
      out.write("	border-radius: 50px !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("// 자바스크립트에서 사용하는 전역변수 선언\n");
      out.write("var g5_url       = \"http://dmshop.kr\";\n");
      out.write("var g5_bbs_url   = \"http://dmshop.kr/bbs\";\n");
      out.write("var g5_is_member = \"\";\n");
      out.write("var g5_is_admin  = \"\";\n");
      out.write("var g5_is_mobile = \"\";\n");
      out.write("var g5_bo_table  = \"\";\n");
      out.write("var g5_sca       = \"\";\n");
      out.write("var g5_editor    = \"\";\n");
      out.write("var g5_cookie_domain = \"\";\n");
      out.write("var g5_shop_url = \"http://dmshop.kr/shop\";\n");
      out.write("var g5_theme_shop_url = \"http://dmshop.kr/theme/moon/shop\";\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("<script src=\"http://dmshop.kr/js/bootstrap.js\"></script>\n");
      out.write("<script src=\"http://dmshop.kr/js/jquery.shop.menu.js?ver=1631\"></script>\n");
      out.write("<script src=\"http://dmshop.kr/js/common.js?ver=1631\"></script>\n");
      out.write("<script src=\"http://dmshop.kr/js/icecream.js?ver=1631\"></script>\n");
      out.write("<script src=\"http://dmshop.kr/js/wrest.js?ver=1631\"></script>\n");
      out.write("<script src=\"http://dmshop.kr/theme/moon/js/jquery.flexslider-min.js\"></script>\n");
      out.write("<link href=\"http://dmshop.kr/theme/moon/js/flexslider.css\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\" integrity=\"sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"hello_wrap\">\n");
      out.write("\n");
      out.write("<!-- 상단 시작 { -->\n");
      out.write("<div id=\"hd\">\n");
      out.write("\n");
      out.write("    <div id=\"tnb\">\n");
      out.write("        <h3>메뉴</h3>\n");
      out.write("        <ul>    \n");
      out.write("\n");
      out.write("            <li><a href=\"signup.wd\"><b>회원가입</b></a></li>\n");
      out.write("            <!-- <li class=\"tnb_cart\"><a href=\"http://dmshop.kr/shop/cart.php\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i> 참고용 장바구니?</a></li> -->\n");
      out.write("            <li class=\"tnb_bookmark\"><a href=\"home.jsp\" ><i class=\"fas fa-home\"></i> HOME<span class=\"st_bg\"></span></a></li>\n");
      out.write("		</ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("      \n");
      out.write("    <div id=\"hd_wrapper\">\n");
      out.write("        \n");
      out.write("        <div id=\"logo\"><a href=\"home.jsp\"><img src=\"images/logo.png\" width=\"150px\" height=\"100px\" alt=\"WatchDogs\"></a></div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        <nav class=\"nav\">\n");
      out.write("        <div id=\"gnb\" >\n");
      out.write("            <h2>사이트 카테고리</h2>\n");
      out.write("            <ul id=\"gnb_1dul\">\n");
      out.write("         \n");
      out.write("			<li class=\"gnb_1dli\" style=\"z-index:999\">\n");
      out.write("			    <a href=\"\" class=\"gnb_1da gnb_1dam\">소개</a>\n");
      out.write("			    <div class=\"gnb_2dul gnb_2dli\" style=\"z-index:999\"><div class=\"gnb_2dul_left\"><strong class=\"gnb_2ul_tit\">소개</strong>      \n");
      out.write("			  </div></div></li>\n");
      out.write("			  \n");
      out.write("			<li class=\"gnb_1dli\" style=\"z-index:998\">\n");
      out.write("			    <a href=\"adoptpage.wd\" class=\"gnb_1da gnb_1dam\">입양</a>\n");
      out.write("			    <div class=\"gnb_2dul gnb_2dli\" style=\"z-index:998\"><div class=\"gnb_2dul_left\"><strong class=\"gnb_2ul_tit\">입양</strong><ul>      \n");
      out.write("			            <li><a href=\"adoptproceeding.wd\" class=\"gnb_2da\">입양 진행 중</a></li>\n");
      out.write("			            <li><a href=\"adopt.wd\" class=\"gnb_2da\">입양 대기 중</a></li>\n");
      out.write("			            <li><a href=\"adoptcomplete.wd\" class=\"gnb_2da\">입양 완료</a></li>\n");
      out.write("			            <li><a href=\"adopttraining.wd\" class=\"gnb_2da\">훈련중</a></li>\n");
      out.write("			    </ul></div></div></li>\n");
      out.write("			    \n");
      out.write("			<li class=\"gnb_1dli\" style=\"z-index:997\">\n");
      out.write("			    <a href=\"trainerlist.wd\" class=\"gnb_1da gnb_1dam\">훈련사 소개</a>\n");
      out.write("			    <div class=\"gnb_2dul gnb_2dli\" style=\"z-index:997\"><div class=\"gnb_2dul_left\"><strong class=\"gnb_2ul_tit\">훈련사 소개</strong>        \n");
      out.write("			    </div></div></li>\n");
      out.write("			    \n");
      out.write("			<li class=\"gnb_1dli\" style=\"z-index:996\">\n");
      out.write("			    <a href=\"notice.wd\" class=\"gnb_1da gnb_1dam\">게시판</a>\n");
      out.write("			    <div class=\"gnb_2dul gnb_2dli\" style=\"z-index:996\"><div class=\"gnb_2dul_left\"><strong class=\"gnb_2ul_tit\">게시판</strong><ul>        \n");
      out.write("			            <li><a href=\"noticelist.wd\" class=\"gnb_2da\">공지</a></li>\n");
      out.write("			            <li><a href=\"reviewlist.wd\" class=\"gnb_2da\">후기</a></li>\n");
      out.write("			    </ul></div></div></li>\n");
      out.write("			<li class=\"gnb_1dli\" style=\"z-index:995\">\n");
      out.write("			    <a href=\"longintypecheck.wd\" class=\"gnb_1da gnb_1dam\">마이 페이지</a>\n");
      out.write("			    <div class=\"gnb_2dul gnb_2dli\" style=\"z-index:995\"><div class=\"gnb_2dul_left\"><strong class=\"gnb_2ul_tit\">마이 페이지</strong>      \n");
      out.write("			</div></div></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    	</nav>\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("	\n");
      out.write("        	\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("	\n");
      out.write("	\n");
      out.write("	<style>\n");
      out.write("		#must_read{background-color: #fc6; border-color: #ebccd1; text-align: center }\n");
      out.write("		#must_read h3{color: #a94442; font-weight: 400; padding: 20px 0; }\n");
      out.write("		\n");
      out.write("		.top_banner{width:1050px; margin:0 auto; margin-top:50px}\n");
      out.write("		.top_banner td{}\n");
      out.write("	</style>\n");
      out.write("	\n");
      out.write("	<section id=\"must_read\">\n");
      out.write("	    <h3> </h3>\n");
      out.write("	</section>\n");
      out.write("	\n");
      out.write("	\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery.touchSlider.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("//<![CDATA[\n");
      out.write("$(document).ready(function() {\n");
      out.write("	$(\"#mb_slide\").touchSlider({\n");
      out.write("		view : 1,\n");
      out.write("		autoplay : {\n");
      out.write("			enable : true,\n");
      out.write("			pauseHover : true,\n");
      out.write("			interval : 8000,\n");
      out.write("		},\n");
      out.write("		btn_prev : $(\"#mb_slide\").next().find(\".btn_prev\"),\n");
      out.write("		btn_next : $(\"#mb_slide\").next().find(\".btn_next\"),\n");
      out.write("	});\n");
      out.write("});\n");
      out.write("//]]>\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("    $(window).scroll(function(){\n");
      out.write("      var sticky = $('.nav'),\n");
      out.write("          scroll = $(window).scrollTop();\n");
      out.write("\n");
      out.write("      if (scroll >= 200) sticky.addClass('fixed');\n");
      out.write("      else sticky.removeClass('fixed');\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $(function (){\n");
      out.write("        var $category = $(\"#category\");\n");
      out.write("\n");
      out.write("        $(\"#menu_open\").on(\"click\", function() {\n");
      out.write("            $category.css(\"display\",\"block\");\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\"#category .close_btn\").on(\"click\", function(){\n");
      out.write("            $category.css(\"display\",\"none\");\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("	<!-- 중간 내용 시작 -->\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("	<div id=\"container\">\n");
      out.write("   		<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- 테이블 시작---------------------------------------->\n");
      out.write("	 <table border=\"1\"  width=\"600\" >\n");
      out.write("	 	<input type=\"hidden\" name=\"reid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reviewdetail.reid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("			<thead>\n");
      out.write("				<tr>\n");
      out.write("					<th colspan=\"4\" style=\"background-color: #f5af46; text-align: center; font-size:18px;\">후기 상세 페이지</th>\n");
      out.write("				</tr>\n");
      out.write("			</thead>\n");
      out.write("			<tbody>\n");
      out.write("			\n");
      out.write("			<tr>\n");
      out.write("				<td>No.</td>\n");
      out.write("				<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reviewdetail.reid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("				<td>조회수</td>\n");
      out.write("				<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reviewdetail.rehit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("			</tr> \n");
      out.write("			\n");
      out.write("			<tr>\n");
      out.write("				<td>작성자</td>\n");
      out.write("				<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reviewdetail.userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("				<td>날짜</td>\n");
      out.write("				<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reviewdetail.redate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("			</tr> \n");
      out.write("				\n");
      out.write("			<tr>\n");
      out.write("				<td>제목</td>\n");
      out.write("				<td colspan=\"3\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reviewdetail.retitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("			</tr>\n");
      out.write("			\n");
      out.write("			<tr>\n");
      out.write("				<td>사진</td>\n");
      out.write("				<td colspan=\"3\"><img width=\"350\" src=\"review/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reviewdetail.refilepath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("			</tr> \n");
      out.write("\n");
      out.write("			<tr>\n");
      out.write("				<td>내용</td>\n");
      out.write("				<td colspan=\"3\" height=\"150\"  id=\"textbox\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reviewdetail.recontent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("			</tr>\n");
      out.write("			<!-- 입력이 안됐을때 첫 화면으로 돌아가게 하기 위해서 하이퍼 링크 달아주기 -->\n");
      out.write("\n");
      out.write("			<tr>				\n");
      out.write("				");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("	\n");
      out.write("					</td>\n");
      out.write("				\n");
      out.write("			</tr>	\n");
      out.write("			\n");
      out.write("			<!-- 아이디 값에 따라 버튼 보이게 안보이게 설정하기------------->\n");
      out.write("	\n");
      out.write("				\n");
      out.write("			</tbody>\n");
      out.write("	</table> <br>\n");
      out.write(" 						<div id=\"button\" onClick=\"location.href='reviewlist.wd'\" style=\"cursor: pointer\"><b>목록으로</b></div>\n");
      out.write("\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    <!-- 중간 내용 끝 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- 하단 시작 { -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("	#bottom_copy{background-color:#3d3e3e; width:100%; margin-top:100px;}\n");
      out.write("	#bottom_copy .w1200{width: 1200px; margin:0 auto; color:#EDEDED; padding: 10px 42px; box-sizing: border-box; font-size: 0.8em; background-color:#3d3e3e;}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<section id=\"bottom_copy\">\n");
      out.write("	<div class=\"w1200\">\n");
      out.write("	    <p>Copyright © WatchDogs. All Rights Reserved.</p>\n");
      out.write("	    010-1234-5678\n");
      out.write("	    서울특별시 서초구 서초동 1305 서산빌딩 더조은 6조\n");
      out.write("	</div>\n");
      out.write("</section>\n");
      out.write("	\n");
      out.write("    <script>\n");
      out.write("    $(function() {\n");
      out.write("        $(\"#top_btn\").on(\"click\", function() {\n");
      out.write("            $(\"html, body\").animate({scrollTop:0}, '500');\n");
      out.write("            return false;\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"http://dmshop.kr/js/sns.js\"></script>\n");
      out.write("<!— } 하단 끝 —>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/review_detailview.jsp(264,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reviewdetail.userid eq userid}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("					<td colspan=\"4\" style=\"text-align: center;\">\n");
          out.write("	 	 				<input type=\"button\" id=\"modify_delete\" onclick=\"location.href='review_mdview.wd?reid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reviewdetail.reid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("';\" value=\"수정/삭제\">\n");
          out.write(" 				");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
