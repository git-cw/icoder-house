<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>中兆·星河汇</title>
    <link href="dwz/themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
    <link href="dwz/themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>
    <link href="dwz/themes/css/print.css" rel="stylesheet" type="text/css" media="print"/>
    <!--[if IE]>
    <link href="dwz/themes/css/ieHack.css" rel="stylesheet" type="text/css" media="screen"/>
    <![endif]-->

    <!--[if lte IE 9]>
    <script src="js/speedup.js" type="text/javascript"></script>
    <![endif]-->
    <script src="js/jquery-1.7.2.min.js" type="text/javascript"></script>
    <script src="js/jquery.cookie.js" type="text/javascript"></script>
    <script src="js/jquery.validate.js" type="text/javascript"></script>
    <script src="js/jquery.bgiframe.js" type="text/javascript"></script>
    <script src="js/xheditor/xheditor-1.2.1.min.js" type="text/javascript"></script>
    <script src="js/xheditor/xheditor_lang/zh-cn.js" type="text/javascript"></script>
    <!-- dwz -->
    <script src="dwz/js/dwz.min.js" type="text/javascript"></script>
    <script src="dwz/js/dwz.regional.zh.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function(){
            DWZ.init("dwz/dwz.frag.xml", {
                loginUrl:"login_dialog.html", loginTitle:"登录",	// 弹出登录对话框
                statusCode:{ok:200, error:300, timeout:301}, //【可选】
                pageInfo:{pageNum:"pageNum", numPerPage:"numPerPage", orderField:"orderField", orderDirection:"orderDirection"}, //【可选】
                debug:false,	// 调试模式 【true|false】
                callback:function(){
                    initEnv();
                    $("#themeList").theme({themeBase:"dwz/themes"}); // themeBase 相对于index页面的主题base路径
                }
            });
        });
    </script>
</head>
<body scroll="no">
<div id="layout">
    <div id="header">
        <div class="headerNav">
            <a><img src="images/logo.png" alt="南昌市物价综合管理系统"/></a>
            <!-- <a class="logo" href="#">logo</a> -->
            <ul class="nav">
                <li><a>欢迎您,<s:property value="#session.currentUser.realname"/></a></li>
                <li><a href="#" onclick="javascript:location.reload();">首页</a></li>
                <li><a href="changePwd_dialog.html" target="dialog" width="530" height="280" resizable="true">修改密码</a></li>
                <li><a href="auth_loginout.action">退出</a></li>
            </ul>
            <ul class="themeList" id="themeList">
                <li theme="default"><div >蓝色</div></li>
                <li theme="green"><div>绿色</div></li>
                <li theme="purple"><div>紫色</div></li>
                <li theme="silver"><div>银色</div></li>
                <li theme="azure"><div class="selected">天蓝</div></li>
            </ul>
        </div>
        <!-- navMenu -->
    </div>

    <!--begin 左侧菜单 -->
    <div id="leftside">
        <div id="sidebar_s">
            <div class="collapse">
                <div class="toggleCollapse"><div></div></div>
            </div>
        </div>
        <div id="sidebar">
            <div class="toggleCollapse"><h2>主菜单</h2><div>收缩</div></div>
            <div class="accordion" fillSpace="sidebar">
                    <div class="accordionHeader">
                        <h2><span>Folder</span>菜单一</h2>
                    </div>
                    <div class="accordionContent">
                        <ul class="tree treeFolder">
                            <li>
                                <a href="＃" target="navTab" rel="home">选项一</a>
                            </li>
                            <li><a href="＃" target="navTab"
                                   rel="home">平价商店管理</a>
                            </li>
                            <li>
                                <a href="＃" target="navTab" rel="home">选项二</a>
                            </li>
                            <li>
                                <a href="＃" target="navTab" rel="home">选项三</a>
                            </li>
                        </ul>
                    </div>
            </div>
        </div>
    </div>
    <!-- end 左侧菜单栏 -->


    <div id="container">
        <div id="navTab" class="tabsPage">
            <div class="tabsPageHeader">
                <div class="tabsPageHeaderContent"><!-- 显示左右控制时添加 class="tabsPageHeaderMargin" -->
                    <ul class="navTab-tab">
                        <li tabid="main" class="main"><a href="javascript:;"><span><span class="home_icon">我的主页</span></span></a></li>
                    </ul>

                </div>
                <div class="tabsLeft">left</div><!-- 禁用只需要添加一个样式 class="tabsLeft tabsLeftDisabled" -->
                <div class="tabsRight">right</div><!-- 禁用只需要添加一个样式 class="tabsRight tabsRightDisabled" -->
                <div class="tabsMore">more</div>
            </div>
            <ul class="tabsMoreList">
                <li><a href="javascript:;">我的主页</a></li>
            </ul>
            <div class="navTab-panel tabsPageContent layoutBox">
                <div class="page unitBox">
                    <div id="ncwj_home" class="tabsPageContent">
                        <div style="width:1000px;"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
<div id="footer">南昌市物价综合管理系统</div>
</body>
</html>