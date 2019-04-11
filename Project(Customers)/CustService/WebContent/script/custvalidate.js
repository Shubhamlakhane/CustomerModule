function customerValidateForm()
{

	var customerName=document.getElementById("cnm").value;
	
	var countryCode=document.getElementById("ccode").value;
	var custPhoneno=document.getElementById("cphno").value;
	var custEmail=document.getElementById("cemail").value;
	var custAddress=document.getElementById("caddr").value;
	var custCity=document.getElementById("ccity").value;
	var custState=document.getElementById("cstate").value;
	var custCountry=document.getElementById("ccountry").value;
	var custZip=document.getElementById("czip").value;
	var custAge=document.getElementById("cage").value;
    var custGender=document.getElementById("cgender").value;
	var custIdtype=document.getElementById("cidtype").value;
	var custIdNo=document.getElementById("cidno").value;
	var custNationality=document.getElementById("cnationality").value;

	if(customerName == null || customerName == "")
	{
		window.alert("Customer  Name cannot be empty")
		return false;
	}
	
	
	if(countryCode == null || countryCode == "")
	{
		window.alert("Customer Code cannot be empty")

		return false;
	}
	if(custPhoneno == null || custPhoneno == "")
	{	
		window.alert("Customer Phone No cannot be empty")
		return false;

	
	}
	if(custEmail == null || custEmail == "")
	{	
		window.alert("Customer Email cannot be empty")
		return false;

	
	}
	if(custAddress == null || custAddress == "")
	{	
		window.alert("Customer Address cannot be empty")
		return false;

	
	}
	if(custCity == null || custCity == "")
	{	
		window.alert("Customer city cannot be empty")
		return false;

	
	}
	if(custState == null || custState == "")
	{	
		window.alert("Customer State cannot be empty")
		return false;

	
	}
	if(custCountry == null || custCountry == "")
	{	
		window.alert("Customer Country cannot be empty")
		return false;

	
	}
	if(custZip == null || custZip == "")
	{	
		window.alert("Customer Zip cannot be empty")
		return false;

	
	}
	if(custAge == null || custAge == "")
	{	
		window.alert("Customer age cannot be empty")
		return false;

	
	}
	if(custGender == null || custGender == "")
	{	
		window.alert("Customer Gender cannot be empty")
		return false;

	
	}
	if(custIdtype == null || custIdtype == "")
	{	
		window.alert("Customer Id Type cannot be empty")
		return false;


	}
	if(custIdNo == null || custIdNo == "")
	{	
		window.alert("Customer Id No cannot be empty")
		return false;


	}
	if(custNationality == null || custNationality == "")
	{	
		window.alert("Customer Nationality cannot be empty")
		return false;

	return true;
	}
}