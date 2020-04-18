<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 14.04.2020
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>oneClient_ADD_</title>
</head>
<body>
<div style="margin-bottom: 2vh">
    <a href="/client/filter">
        <button style="height: 7vh;width: 10vw;margin:0;">
            <p style="font-size: 2vmin;"> Back </p>
        </button>
    </a>
</div>

<div>
    <form:form method="POST" action="/client/person/add"
               modelAttribute="o_model">
        <table>
            <tr>
                <td>
                    <form:label path="clientName" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Name :: </form:label>
                    <form:input path="clientName"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                </td>
            </tr>
        </table>
        <table>
            <tr>
                <td>
                    <form:label path="max_credit_count" type="float" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Max Credit Count :: </form:label>
                    <form:input path="max_credit_count" type="float" cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                </td>
            </tr>
        </table>
        <table>
            <tr>
                <td>
                    <form:label path="max_credit_day" type="float" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh">Max Credit Day :: </form:label>
                    <form:input path="max_credit_day" type="float"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
                </td>
            </tr>
        </table>
        <table>
            <tr>
                <td>
                    <input type="submit" value="Insert" style="font-size: 200px;margin-left: 1vw;" />
                </td>

            </tr>
        </table>
    </form:form>

</div>


</body>
</html>
