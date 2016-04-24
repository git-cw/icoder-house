$(function(){
		$("#message").hide();
		$("#checkCodeBox").css("background-image","url(users_getCaptcha.action?it=" + Math.random()+")");
		$("#checkCodeBox").click(function(){
			$("checkCodeInput").val("");
			$("#checkCodeBox").effect('fade', 300 );
			$(this).css("background-image","url(users_getCaptcha.action?it=" + Math.random()+")");
			$("#checkCodeBox").fadeIn(300);
		});
	});
	function reset(){
		$(".loginBox input").val("");
	}
	function submit(){
		if($("#unameInput").val()==""){
			 $("#message").html("请先输入用户名").show().effect('shake', 500 );
			 $("#unameInput").focus();
			 return;
		}
		if($("#pwdInput").val()==""){
			 $("#message").html("请先输入密码").show().effect('shake', 500 );
			 $("#pwdInput").focus();
			 return;
		}
		if($("#checkCodeInput").val()==""){
			 $("#message").html("验证码不能为空").show().effect('shake', 500 );
			 $("#checkCodeInput").focus();
			 return;
		}
		var username =  $("#unameInput").val();
		var password = $("#pwdInput").val();
		var checkCode = $("#checkCodeInput").val();
		$.ajax({
			url :"login.action",
			type:"POST",
			data:{username:username,password:password,checkCode:checkCode},
			cache : false,
			success : function(msg) {
			    var json = JSON.parse(msg);
				if(json.statusCode=='200'){
					 $("#message").html("登录成功，正在为您跳转...").show();
					 location.href="/";
				}
				else if(json.statusCode=='301'){
					 $("#message").html("登录失败，验证码错误").show().effect('shake', 500 );
					 $("#checkCodeInput").val("")
					 $("#checkCodeInput").focus();
				}
				else if(json.statusCode=='302'){
					 $("#message").html("用户名或密码错误，请重试").show().effect('shake', 500 );
					 $("#unameInput").focus();
				}
				else{
					 $("#message").html("登录失败，请重试").show().effect('shake', 500 );
				}
			},
			error:function(msg){
				 $("#message").html("登录失败，请重试").show().effect('shake', 500 );
			}
		});
	}