<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.Set" %>
<html>
<body>
<h2>Simple SMS Application!</h2>
<%
    HashMap map = com.ideamart.sms.sample.DB.DBClass.getDBInstance();
    if(!map.isEmpty()) {
        out.print("name"+" "+"message");
        out.print("<br>");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry entry : entrySet) {
            out.print(entry.getKey() + " " + entry.getValue());
            out.print("<br>");
        }
    }
%>
</body>
</html>
