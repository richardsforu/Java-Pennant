function validate() {

	var cname = document.getElementById("cname").value;
	var cemail = document.getElementById("cemail").value;
	var cmobile = document.getElementById("cmobile").value;
	var cdob = document.getElementById("cdob").value;

	var valid = true;

	if (cname == "") {
		valid = false;
		document.getElementById("cnameMsg").innerHTML = "Name is Required";
	} else {
		document.getElementById("cnameMsg").innerHTML = "";
	}

	if (cemail == "") {
		document.getElementById("cemailMsg").innerHTML = "Email is Required";
	} else {

		var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/
		if (!emailReg.test(cemail)) {
			document.getElementById("cemailMsg").innerHTML = "Invalid Email";
			valid = false;
		} else
			document.getElementById("cemailMsg").innerHTML = "";
	}

	if (cmobile == "") {
		document.getElementById("cmobileMsg").innerHTML = "Mobile is Required";
	} else {

		var pinRegExp = /^[0-9]{10}$/;

		if (!pinRegExp.test(cmobile)) {
			document.getElementById("cmobileMsg").innerHTML = "Invalid Mobile";
			valid = false;
		} else {
			document.getElementById("cmobileMsg").innerHTML = "";
		}

	}

	if (cdob == "") {
		document.getElementById("cdobMsg").innerHTML = "DOB is Required";
		valid = false;
	} else {

		document.getElementById("cdobMsg").innerHTML = "";

	}

	if (valid) {

		return true;
	} else {
		return false;
	}

}

// -------------------

function checkName() {
	

	// Get Name From Input Field
	var cname = document.getElementById("cname").value;

	// 1. create 'XMLHttpRequest' Object.
	var ajaxObj;
	if (window.XMLHttpRequest) {
		// IE7, Mozila , chrome , opera , safari
		ajaxObj = new XMLHttpRequest();
	} else {
		// IE5, IE6
		ajaxObj = new ActiveXObject("Microsoft.XMLHTTP");
	}

	// 2. Send Request To Server
	var rn=Math.random();
	var url = "checkName.do?cname=" + cname+"&rn="+rn; // // Request To 'Servlet'
	ajaxObj.open("GET", url, true);
	ajaxObj.send();

	ajaxObj.onreadystatechange = function() {
		if (ajaxObj.readyState == 4) {
			// 3. Get Response From Server
			var respTxt = ajaxObj.responseText;
			// 4. Update part of web Page:
			document.getElementById("status").innerHTML = respTxt;
		}
	};

}
