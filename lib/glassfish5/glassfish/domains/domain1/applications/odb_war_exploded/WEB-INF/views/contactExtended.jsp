<%@ page import="pageEntity.contactPage" %>
<%@ page import="DAO.generatorContactPage" %>
<%@ page import="ent.addresEntity" %>
<%@ page import="ent.emailEntity" %>
<%@ page import="ent.phoneEntity" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 14.04.2020
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>contact_EXT_</title>
</head>
<body>
<div style="margin-top: 0;width: 98vw; margin-bottom: 2vh ">
    <h2 style="text-align: center;margin-top: 1vh;margin-bottom: 1vh"> Contact Info </h2>
</div>
<div style="margin-bottom: 2vh;margin-top: 0">
    <a href="<%= "/client/person/" + request.getAttribute("backKey") %>">
        <button id="back" style="height: 7vh;width: 10vw;margin:0;">
            <p style="margin: 0;font-size: 2vmin;"> Back </p>
        </button>
    </a>
    <a href="<%= "/contact/delete/" + request.getAttribute("absName") %>">
        <button id="delete" style="height: 7vh;width: 10vw;margin:0;">
            <p style="margin: 0;font-size: 2vmin;"> Delete </p>
        </button>
    </a>
</div>
<div style="margin-top: 0vh; margin-bottom: 2vh">
    <form:form method="POST" action="<%= "/contact/" + request.getAttribute("absName")%>"
                modelAttribute="c_model">
    <table>
        <tr>
            <td>
                <form:label path="contactName" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh"> ContactName :: </form:label>
                <form:input id="name" path="contactName"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
            </td>

        </tr>
        <tr>
            <td>
                <form:label path="addAdress" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh"> New Address :: </form:label>
                <form:input id="address" path="addAdress"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
            </td>

        </tr>
        <tr>
            <td>
                <form:label path="addPhone" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh"> New Phone Number :: </form:label>
                <form:input id="phone" path="addPhone"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
            </td>

        </tr>
        <tr>
            <td>
                <form:label path="addEmail" cssStyle="margin-left: 1vw;font-size: 2.3vmin;margin-top: 2vh"> New Email :: </form:label>
                <form:input id="email" path="addEmail"  cssStyle="margin-right :  1vw;font-size: 2vmin"/>
            </td>

        </tr>
    </table>
    <table>
        <tr>
            <td>
                <input type="submit" id="update" value="Update/Add" style="font-size: 10vw;margin-left: 1vw;margin-bottom: 0vh" />
            </td>
        </tr>
    </table>
    </form:form>
</div>
<div style="display: flex">
    <%
        contactPage cop = null;
        generatorContactPage gen = new generatorContactPage();
        gen.setContactName((String) request.getAttribute("absName"));
        for ( contactPage cp : gen.getPageContact()){
            cop = cp;
        }
    %>
    <div style="width: 32vw;overflow: auto;">
        <h3 style="text-align: center"> Address</h3>
        <% for (addresEntity ade : cop.getContactAddress()){ %>
            <div style="display: flex">
              <p style="margin-left : 1vw;margin-right: 1vw; margin-top:1vh;margin-bottom:1vh;font-size:2vmin;"> <%= ade.getAddres()%></p>
                <a href="<%= "/contact/addressDelete/" + cop.getContactName() + "/" + ade.getAddres() %>">
                    <button id="deleteAddress" style="height: 3vh;width: 5vw">
                        <p style="text-align: center;font-size: 1.5vmin;margin: 0"> Delete</p>
                    </button>
                </a>
            </div>
        <% } %>
    </div>
    <div style="width: 32vw;overflow: auto">
        <h3 style="text-align: center"> Email</h3>
        <% for (emailEntity eme : cop.getContactEmail()){ %>
        <div style="display: flex">
            <p style="margin-left : 1vw;margin-right: 1vw; margin-top:1vh;margin-bottom:1vh;font-size:2vmin;"> <%= eme.getEmail()%></p>
            <a href="<%= "/contact/emailDelete/" + cop.getContactName() + "/" + eme.getEmail() %>">
                <button id="deleteEmail" style="height: 3vh;width: 5vw">
                    <p style="text-align: center;font-size: 1.5vmin;margin: 0"> Delete</p>
                </button>
            </a>
        </div>
        <% } %>
    </div>
    <div style="width: 32vw;overflow:auto;">
        <h3 style="text-align: center"> Phone</h3>
        <% for (phoneEntity phe : cop.getContactPhone()){ %>
        <div style="display: flex">
            <p style="margin-left : 1vw;margin-right: 1vw; margin-top:1vh;margin-bottom:1vh;font-size:2vmin;"> <%= phe.getPhone()%></p>
            <a href="<%= "/contact/phoneDelete/" + cop.getContactName() + "/" + phe.getPhone() %>">
                <button id="deletePhone" style="height: 3vh;width: 5vw">
                    <p style="text-align: center;font-size: 1.5vmin;margin: 0"> Delete</p>
                </button>
            </a>
        </div>
        <% } %>
    </div>
</div>

</body>
</html>
