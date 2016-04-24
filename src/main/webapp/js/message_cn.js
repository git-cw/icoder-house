jQuery.extend(jQuery.validator.messages, {
/*  required: "<font color='red'><b>请输入内容</b></font>",*/
  remote: "<font color='red'><b>请修正该字段</b></font>",
  email: "<font color='red'><b>请输入正确格式的电子邮件</b></font>",
  url: "<font color='red'><b>请输入合法的网址</b></font>",
  date: "<font color='red'><b>请输入合法的日期</b></font>",
  dateISO: "<font color='red'><b>请输入合法的日期 (ISO)</b></font>",
  number: "<font color='red'><b>请输入合法的数字</b></font>",
  digits: "<font color='red'><b>只能输入整数</b></font>",
  creditcard: "<font color='red'><b>请输入合法的信用卡号</b></font>",
  equalTo: "<font color='red'><b>请再次输入相同的值</b></font>",
  accept: "<font color='red'><b>请输入拥有合法后缀名的字符串</b></font>",
  maxlength: jQuery.validator.format("<font color='red'><b>请输入一个 长度最多是 {0} 的字符串</b></font>"),
  minlength: jQuery.validator.format("<font color='red'><b>请输入一个 长度最少是 {0} 的字符串</b></font>"),
  rangelength: jQuery.validator.format("<font color='red'><b>请输入 一个长度介于 {0} 和 {1} 之间的字符串</b></font>"),
  range: jQuery.validator.format("<font color='red'><b>请输入一个介于 {0} 和 {1} 之间的值</b></font>"),
  max: jQuery.validator.format("<font color='red'><b>请输入一个最大为{0} 的值</b></font>"),
  min: jQuery.validator.format("<font color='red'><b>请输入一个最小为{0} 的值</b></font>")
});