
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="style.css" type="text/css"/>
</head>
<body>
<a href="../../index.jsp">Back to main menu</a>
<br/>
<br/>

<h1>YKY Cable List</h1>

<c:if test="${!empty listCables}">
    <table class="tg">
        <tr>
            <th width="80">ID</th>
            <th width="120">Voltage</th>
            <th width="120">nCoresXsection</th>
            <th width="120">Shape</th>
            <th width="120">OuterDiametr</th>
            <th width="120">Mass</th>
            <th width="80">Edit</th>
            <th width="80">Delete</th>
        </tr>
        <c:forEach items="${listCables} " var="cable">
            <td>${cable.id}</td>
            <td>${cable.voltage}</td>
            <td>${cable.nCoresXsection}</td>
            <td>${cable.shape}</td>
            <td>${cable.outerDiametr}</td>
            <td>${cable.mass}</td>
            <td><a href="<c:url value='/edit/${cable.id}'/>">Edit</a></td>
            <td><a href="<c:url value='/delete/${cable.id}'/>">Delete</a></td>
        </c:forEach>
        <tr>

        </tr>
    </table>
</c:if>

<h1>Add Cable to Database</h1>

<c:url var="addAction" value="/cable/add"/>

<form:form action="${addAction}" commandName="cable">
    <table>
        <c:if test="${!empty cable.voltage}">
            <tr>
                <td>
                    <form:label path="id">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="id" readonly="true" size="8" disabled="true"/>
                    <form:hidden path="id"/>
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form:label path="nCoresXsection">
                    <spring:message text="nCoresXsection"/>
                </form:label>
            </td>
            <td>
                <form:input path="nCoresXsection"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="shape">
                    <spring:message text="Shape"/>
                </form:label>
            </td>
            <td>
                <form:input path="shape"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="outerDiametr">
                    <spring:message text="OuterDiametr"/>
                </form:label>
            </td>
            <td>
                <form:input path="outerDiametr"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="mass">
                    <spring:message text="Mass"/>
                </form:label>
            </td>
            <td>
                <form:input path="mass"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${!empty cable.voltage}">
                    <input type="submit"
                           value="<spring:message text="Edit Cable"/>"/>
                </c:if>
                <c:if test="${empty cable.voltage}">
                    <input type="submit"
                           value="<spring:message text="Add Cable"/>"/>
                </c:if>
            </td>
        </tr>
    </table>
</form:form>


</body>
</html>
