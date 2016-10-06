<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>index</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="Grid_Style.css" />
<!--menu script -->
<link rel="stylesheet" type="text/css" href="menu_style.css" />
<link rel="stylesheet" type="text/css" media="all" href="jsDatePick_ltr.min.css" />
<script type="text/javascript" src="js/clockp.js"></script>
<script type="text/javascript" src="js/clockh.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/ddaccordion.js"></script>
<script type="text/javascript" src="js/jquery.1.4.2.js"></script>
<script type="text/javascript" src="datepickerjs/jsDatePick.jquery.min.1.3.js"></script>

<script>
	function updateChannelCenter() {
		var doctorId = document.getElementById("doctor_id").value;
		var firstName = document.getElementById("doctor_first_name").value;
		var lastName = document.getElementById("doctor_last_Name").value;
		var nameWithInnit = document.getElementById("doctor_innitname").value;
		var doctorWeb = document.getElementById("doctor_web").value;
		var email = document.getElementById('doctor_email').value;
		var mobileNumber = document.getElementById("doctor_mobile_no").value;
		var doctorNic = document.getElementById("doctor_nic").value;
		var residenceNumber = document.getElementById("doctor_residence_no").value;
		var age = document.getElementById("doctor_age").value;
		var regNo = document.getElementById("doctor_reg_no").value;
		var address = document.getElementById("doctor_address").value;
		var file = document.getElementById("doctor_file").value;
		var description = document.getElementById("doctor_desc").value;
		var activeStatus = 1;
		
		if (doctorId == null || doctorId == "") {
			alert("Please select the record you need to delete !");
		} else {
			var formInput = $(this).serialize();
			$.getJSON('ajax/updateDoctor.action?doctorId=' + doctorId + '&firstName=' + firstName
					+ '&lastName=' + lastName + '&nameWithInnitials=' + nameWithInnit + '&registrationNumber=' + regNo
					+ '&nic=' + doctorNic + '&age=' + age + '&address=' + address + '&description=' + description
					+ '&isActive=' + activeStatus + '&email=' + email + '&web=' + doctorWeb + '&mobile=' + mobileNumber
					+ '&residence=' + residenceNumber + "&imageFile=" + file, formInput, function(data) {
				$('.result').html('' + data.doctorId + '');
				$('.result').html('' + data.firstName + '');
				$('.result').html('' + data.lastName + '');
				$('.result').html('' + data.nameWithInnitials + '');
				$('.result').html('' + data.registrationNumber + '');
				$('.result').html('' + data.nic + '');
				$('.result').html('' + data.age + '');
				$('.result').html('' + data.address + '');
				$('.result').html('' + data.description + '');
				$('.result').html('' + data.isActive + '');
				$('.result').html('' + data.email + '');
				$('.result').html('' + data.web + '');
				$('.result').html('' + data.mobile + '');
				$('.result').html('' + data.residence + '');
				$('.result').html('' + data.file + '');

				//setting the updated values on the grid.
				$("#doctor_id").val(data.doctorId);
				$("#rdg_1_first_name" + data.doctorId).val(data.firstName);
				$("#rdg_1_last_name" + data.doctorId).val(data.lastName);
				$("#rdg_1_name_init" + data.doctorId).val(data.nameWithInnitials);
				$("#rdg_1_nic" + data.doctorId).val(data.nic);
				$("#rdg_1_age" + data.doctorId).val(data.age);
				$("#rdg_1_address" + data.doctorId).val(data.address);
				$("#rdg_1_desc" + data.doctorId).val(data.description);
				$("#rdg_1_mobile" + data.doctorId).val(data.mobile);
				$("#rdg_1_residence" + data.doctorId).val(data.residence);
				$("#rdg_1_email" + data.doctorId).val(data.email);
				$("#rdg_1_web" + data.doctorId).val(data.web);
				$("#rdg_1_regno" + data.doctorId).val(data.registrationNumber);
			});
		}
	}

	function makeClear() {
		$("#doctor_id").val("");
		$("#doctor_first_name").val("");
		$("#doctor_last_Name").val("");
		$("#doctor_email").val("");
		$("#doctor_web").val("");
		$("#doctor_innitname").val("");
		$("#doctor_mobile_no").val("");
		$("#doctor_nic").val("");
		$("#doctor_residence_no").val("");
		$("#doctor_age").val("");
		$("#doctor_reg_no").val("");
		$("#doctor_address").val("");
		$("#doctor_file").val("");
		$("#doctor_desc").val("");
		$("#cc_active_status").val("");
	}

	function displayChannelCenterData(doctorId, firstName, lastName, nameWithInnits, nic, age, address, description,
			mobile, residence, email, web, regNo) {
		$("#doctor_id").val(doctorId);
		$("#doctor_first_name").val(firstName);
		$("#doctor_last_Name").val(lastName);
		$("#doctor_innitname").val(nameWithInnits);
		$("#doctor_mobile_no").val(mobile);
		$("#doctor_nic").val(nic);
		$("#doctor_residence_no").val(residence);
		$("#doctor_age").val(age);
		$("#doctor_reg_no").val(regNo);
		$("#doctor_address").val(address);
		//$("#doctor_file").val();
		$("#doctor_desc").val(description);
		$("#doctor_email").val(email);
		$("#doctor_web").val(web);
		//$("#cc_active_status").val();

	}

	function channelCenterRegisterFormSubmit(evt) {
		
		var modelId = document.getElementById("doctor_id").value;
		if (evt != null) {
			if (modelId == null || modelId == "") {
				alert("Please select the record you need to delete !");
			} else {
				document.forms.doctorRegistrationForm.action = evt;
				document.forms.doctorRegistrationForm.method = "post";
				document.forms.doctorRegistrationForm.submit();
			}
		}
	}
</script>

<script type="text/javascript">
	ddaccordion.init({
		headerclass : "submenuheader", //Shared CSS class name of headers group
		contentclass : "submenu", //Shared CSS class name of contents group
		revealtype : "click", //Reveal content when user clicks or onmouseover the header? Valid value: "click", "clickgo", or "mouseover"
		mouseoverdelay : 200, //if revealtype="mouseover", set delay in milliseconds before header expands onMouseover
		collapseprev : true, //Collapse previous content (so only one open at any time)? true/false 
		defaultexpanded : [], //index of content(s) open by default [index1, index2, etc] [] denotes no content
		onemustopen : false, //Specify whether at least one header should be open always (so never all headers closed)
		animatedefault : false, //Should contents open by default be animated into view?
		persiststate : true, //persist state of opened contents within browser session?
		toggleclass : [ "", "" ], //Two CSS classes to be applied to the header when it's collapsed and expanded, respectively ["class1", "class2"]
		togglehtml : [ "suffix", "<img src='images/plus.gif' class='statusicon' />",
				"<img src='images/minus.gif' class='statusicon' />" ], //Additional HTML added to the header when it's collapsed and expanded, respectively  ["position", "html1", "html2"] (see docs)
		animatespeed : "fast", //speed of animation: integer in milliseconds (ie: 200), or keywords "fast", "normal", or "slow"
		oninit : function(headers, expandedindices) { //custom code to run when headers have initalized
			//do nothing
		},
		onopenclose : function(header, index, state, isuseractivated) { //custom code to run whenever a header is opened or closed
			//do nothing
		}
	})
</script>
<!--End menu script -->


<!--left menu Script -->
<link rel="stylesheet" href="css/leftmenu.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {

			var menu_ul = $('.leftmenu > li > ul'), menu_a = $('.leftmenu > li > a');

			menu_ul.hide();

			menu_a.click(function(e) {
				e.preventDefault();
				if (!$(this).hasClass('active')) {
					menu_a.removeClass('active');
					menu_ul.filter(':visible').slideUp('normal');
					$(this).addClass('active').next().stop(true, true).slideDown('normal');
				} else {
					$(this).removeClass('active');
					$(this).next().stop(true, true).slideUp('normal');
				}
			});

		});
	</script>

	<!-- End left menu Script -->
</head>
<body>


	<!--main -->
	<div id="main">
		<!--head_slice -->
		<div id="head_slice">
			<div id="hs_bar">
				<!--hs_bar -->
			</div>
			<!--End of hs_bar -->
		</div>
		<!--End of head_slice -->

		<!--header -->
		<div id="header">
			<!--h_bar -->
			<div id="h_bar">
				<div>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</div>
				<div>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</div>
				<div>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</div>
				<div>&emsp;&emsp;&emsp;</div>
				<div>
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					<s:a href="j_spring_security_logout">Logout</s:a>
				</div>
			</div>
			<!--h_bar -->
		</div>
		<!--header -->

		<!--content -->
		<div id="content">
			<!--content_bar-->
			<div id="content_bar">
				<!--left_bar-->
				<div id="left_bar">

					<!--jquery left menu-->
					<div id="wrapper">

						<ul class="leftmenu">
							<li class="item1"><a href="#">Doctor Management</a>
								<ul>
									<li class="subitem1"><s:a href="doctorManagement/doctorRegistration">Register Doctor</s:a></li>
									<li class="subitem2"><s:a href="doctorSpeciality">Doctor Speciality</s:a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
							<li class="item2"><a href="#">Channel Center Management</a>
								<ul>
									<li class="subitem1"><s:a href="ChennelCenterRegistration">Register Channel Center</s:a></li>
									<li class="subitem2"><a href="#">Channel Center Operations<span>6</span>
									</a></li>
									<li class="subitem3"><a href="#">Administrator Functions<span>2</span>
									</a></li>
								</ul></li>
							<li class="item3"><a href="#">Medical Clinic Management</a>
								<ul>
									<li class="subitem1"><s:a href="registerClinic">Register Clinic</s:a></li>
									<li class="subitem2"><a href="#">Strange “Stuff” <span>6</span></a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
							<li class="item4"><a href="#">Appointment Management</a>
								<ul>
									<li class="subitem1"><a href="#">Cute Kittens <span>14</span></a></li>
									<li class="subitem2"><a href="#">Strange “Stuff” <span>6</span></a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
							<li class="item5"><a href="#">Channeling</a>
								<ul>
									<li class="subitem1"><a href="#">Cute Kittens <span>14</span></a></li>
									<li class="subitem2"><a href="#">Strange “Stuff” <span>6</span></a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
							<li class="item3"><a href="#">Medical Test</a>
								<ul>
									<li class="subitem1"><a href="#">Cute Kittens <span>14</span></a></li>
									<li class="subitem2"><a href="#">Strange “Stuff” <span>6</span></a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
						</ul>

					</div>
					<!--End jquery left menu-->

				</div>
				<!--End left_bar-->

				<!--right_bar-->
				<div id="right_bar">
					<form id="doctorRegistrationForm" action="doctorSupport!addDoctor.action" method="post">
						<table>
							<tr>
								<td>XXXXXXXXX</td>
								<td><s:textfield id="doctor_first_name" name="firstName" required="true" label="" theme="simple"></s:textfield></td>
								
							</tr>
							<tr>
								<td>XXXXXXXXX</td>
								<td><s:textfield id="doctor_last_Name" name="lastName" label="" required="true" theme="simple"></s:textfield></td>
								
							</tr>
							<tr>
								<td>XXXXXXXXX</td>
								<td><s:textfield id="doctor_innitname" name="nameWithInnitials" label="" required="true" theme="simple"></s:textfield></td>
								
							</tr>
							<tr>
								<td>XXXXXXXXX</td>
								<td><s:textfield id="doctor_nic" name="nic" label="" required="true" theme="simple"></s:textfield></td>
								
							</tr>
									
							<tr>
								<td><input type="hidden" id="xxx_id" name="xxxId"
									value="<s:property value="xxxId"/>" /></td>
							</tr>
							
							
						</table>
					</form>
					</br> </br>
					<div class="table-wrapper">
						<table class="data">
							<tr>
								<td class="cs_save_grid">XXXXXXX</td>
								<td class="cs_save_grid">XXXXXXX</td>
								<td class="cs_save_grid">XXXXXXX</td>
								<td class="cs_save_grid">XXXXXXX</td>
							</tr>

							<s:iterator value="doctorList">
								<tr>
									<td class="dynamic_grid"><input id="rdg_1_first_name<s:property value="doctorId" />" class="dynamic_grid"
										type="text" value="<s:property
									    value="firstName"/>" /></td>

									<td class="dynamic_grid"><input id="rdg_1_last_name<s:property value="doctorId" />" class="dynamic_grid"
										type="text" value="<s:property
									    value="lastName"/>" /></td>

									<td class="dynamic_grid"><input id="rdg_1_name_init<s:property value="doctorId" />" class="dynamic_grid"
										type="text" value="<s:property
									    value="nameWithInnitials"/>" /></td>

									<td class="dynamic_grid"><input id="rdg_1_nic<s:property value="doctorId" />" class="dynamic_grid"
										type="text" value="<s:property
									    value="nic" />" /></td>


									<td class="myx"><input class="myx" type="button"
										onclick="displayChannelCenterData(document.getElementById('<s:property value="doctorId" />').value, 
										document.getElementById('rdg_1_first_name<s:property value="doctorId" />').value,
										document.getElementById('rdg_1_last_name<s:property value="doctorId" />').value,
										document.getElementById('rdg_1_name_init<s:property value="doctorId" />').value,
										document.getElementById('rdg_1_regno<s:property value="doctorId" />').value)" />
									</td>

									<td class="myx"><input type="hidden" id="<s:property value="doctorId" />"
										value="<s:property value="doctorId" />" /></td>

								</tr>
							</s:iterator>


						</table>
					</div>

				</div>
				<!--End right_bar-->
			</div>
			<!--End content_bar -->
		</div>
		<!--End content -->

		<!--footer -->
		<div id="footer">
			<!--footer_bar-->
			<div id="footer_bar"></div>
			<!--footer_bar -->
		</div>
		<!--footer -->
	</div>
	<!--end of main -->

</body>
</html>