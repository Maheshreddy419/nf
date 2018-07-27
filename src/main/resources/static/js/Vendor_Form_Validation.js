function validate(){  
var name=document.Vendor_Registration.Vendor_Name.value;
var store_name=document.Vendor_Registration.Vendor_Store_Name.value;
var city=document.Vendor_Registration.Vendor_Store_City.value;
var email=document.Vendor_Registration.Vendor_Email.value;
var atposition=email.indexOf("@");
var dotposition=email.lastIndexOf(".");
var services= document.Vendor_Registration.Services;
var status=false;  

/*Vendor Name*/
if(name==""){  
document.getElementById("required").innerHTML=  
" <img src='../../static/images/unchecked.gif' /> Please Enter your Vendor Name";  
status=false;
}
else{  
document.getElementById("required").innerHTML=" <img src='../../static/images/checked.gif' />"; 
status=true;
}

/*Vendor Store Name*/
/*if(store_name==""){
	document.getElementById("required1").innerHTML=  
		" <img src='../../static/images/unchecked.gif'/> Please Enter your Vendor Store Name";  
		status=false;	
}
else{  
	document.getElementById("required1").innerHTML=" <img src='../../static/images/checked.gif'/>"; 
	status=true;
	}
*/
/*Vendor City*/
if(city==""){
	document.getElementById("required2").innerHTML=  
		" <img src='../../static/images/unchecked.gif' /> Please Select the city of your Vendor Store";  
		status=false;	
}
else{  
	document.getElementById("required2").innerHTML="";
/*	document.getElementById("required2").innerHTML=" <img src='../../static/images/checked.gif'/>"; */
	status=true;
	}

/*Vendor Email*/
if(email==""){
	document.getElementById("required3").innerHTML=  
		" <img src='../../static/images/unchecked.gif' /> Please Enter your E-mail ID";  
		status=false;	
}
else if(atposition<1 || dotposition<atposition+2 || dotposition+2>=email.length){
	document.getElementById("required3").innerHTML=  
		" <img src='../../static/images/unchecked.gif' /> Please Enter a Valid E-mail ID";  
		status=false;
}
else{  
	document.getElementById("required3").innerHTML=" <img src='../../static/images/checked.gif' />"; 
	status=true;
	}

/*Vendor Services*/
for(var i=0; i<services.length;i++){
	if(services[i].checked)
	break;
}
if(i==services.length){
	document.getElementById("required4").innerHTML=  
		" <img src='../../static/images/unchecked.gif' /> Please Select your Services";  
		status=false;	
}
else{
	document.getElementById("required4").innerHTML="";
/*	document.getElementById("required4").innerHTML=" <img src='../../static/images/checked.gif'/>"; */
	status=true;
	}


return status;  
}



/*var passwordlength=document.f1.password.value.length;  
*/
/*if(passwordlength<6){  
document.getElementById("passwordlocation").innerHTML=  
" <img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> Password must be greater than 6";  
status=false; 
}else{  
document.getElementById("passwordlocation").innerHTML=" <img src='http://www.javatpoint.com/javascriptpages/images/checked.gif'/>";  
}  
*/  
