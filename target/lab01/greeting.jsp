<html title="Lab01 - Greetings">
	
	<BODY>
	
		<jsp:useBean id="user" class="ca.bcit.comp4613.lab01.domain.User" scope="request"/>		
		<h1>Hello ${user.name}<BR> 
			${initParam.greeting }</h1><br />
			The current time is:<jsp:include page="/dateAndTime.jsp"/>		
	</BODY>
	
</html>
