function sayHello() {
			document.write("<h1> good after noon!!!!!!!</h1>");
			document.write("<h1> today date is as" + Date() + "</h1>");
		} 
		function validate() {
			var name = document.lf.UserName.value.trim();
			var password=document.lf.password.value.trim();
			if (name == "") {
				alert("Usename shold not be empty");
				return false;
			}
			if(password=="")
				{
				alert("password shold not be empty");
				return false;
				}

		}