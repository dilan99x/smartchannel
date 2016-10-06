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
	function appointmentProceed(clinic_id, speciality_id, doctor_id, cc_id, location, dateFrom) {
		appoitmentRegisterFormSubmit(clinic_id, speciality_id, doctor_id, cc_id, location, dateFrom);
		$("#right_bar").empty();
		$('#right_bar').load('Doctor.jsp #test');
	}

	function makeClear() {
	}

	function displayChannelCenterData() {
	}
	function appoitmentRegisterFormSubmit(clinic_id, speciality_id, doctor_id, cc_id, location, dateFrom) {
		document.getElementById('clg_1_doctor_name' + clinic_id);

		document.forms.appoitmentRegistrationForm.action = "fetchSelectedAppoinment.action";
		document.forms.appoitmentRegistrationForm.method = "post";
		document.forms.appoitmentRegistrationForm.clinicId.value = clinic_id;
		document.forms.appoitmentRegistrationForm.doctorId.value = doctor_id;
		document.forms.appoitmentRegistrationForm.specialityId.value = speciality_id;
		document.forms.appoitmentRegistrationForm.doctorId.value = doctor_id;
		document.forms.appoitmentRegistrationForm.channelCenterId.value = cc_id;
		document.forms.appoitmentRegistrationForm.dateFrom.value = dateFrom; //dateFrom cannot be null value
		//document.forms.appoitmentRegistrationForm.fromDate.value = toDate;
       
		document.forms.appoitmentRegistrationForm.submit();
	

	}
</script>

<script type="text/javascript">
	window.onload = function() {
		g_globalObject = new JsDatePick({
			useMode : 2,
			isStripped : true,
			target : "clinic_date_from",
			dateFormat : "%d-%M-%Y"
		});

		g_globalObject2 = new JsDatePick({
			useMode : 2,
			isStripped : false,
			target : "clinic_date_to",
			dateFormat : "%d-%M-%Y"
		});
	};
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
									<li class="subitem3"><a href="channelcenterId#">Automatic Fails <span>2</span></a></li>
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
									<li class="subitem1"><s:a href="makeAppointment">Make Appointment</s:a></li>
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
					<form id="appoitmentFetchingForm" action="fetchAppointments" method="post">
						<table>
							<tr>
								<td>Speciality</td>
								<td><s:select id="speciality_id" list="speciality" name="specialityId" value="specialityId" listKey="key"
										listValue="value" headerValue="Select Speciality" theme="simple" /></td>
								<td>&emsp;</td>
								<td></td>
								<td></td>
							</tr>

							<tr>
								<td>Doctor</td>
								<td><s:select id="doctors_id" list="doctors" name="doctorId" value="doctorId" listKey="key"
										listValue="value" headerValue="Select Doctors" theme="simple" /></td>
								<td>&emsp;</td>
								<td></td>
								<td></td>
							</tr>

							<tr>
								<td>Hospital</td>
								<td><s:select id="channel_centers_id" list="channelCenters" name="channelCenterId" value="channelCenterId"
										listKey="key" listValue="value" headerValue="Select Doctors" theme="simple" /></td>
								<td>&emsp;</td>
								<td></td>
								<td></td>
							</tr>


							<tr>
								<td>From Date</td>
								<td><s:textfield id="clinic_date_from" name="fromDate" readonly="true" required="true" theme="simple"></s:textfield></td>
								<td>&emsp;</td>
								<td>To Date</td>
								<td><s:textfield id="clinic_date_to" name="toDate" readonly="true" required="true" theme="simple"></s:textfield></td>

							</tr>

							<tr>
								<td>&emsp;&emsp;&emsp;</td>
								<td>&emsp;&emsp;&emsp;</td>
								<td>&emsp;</td>
								<td>&emsp;&emsp;&emsp;</td>
								<td>&emsp;&emsp;&emsp;</td>
							</tr>

							<tr>
								<td colspan="2">&emsp;&emsp;&emsp;&emsp;&emsp;<input type="submit" value="Search" /> <input type="button"
									value="Clear" onclick="makeClear()" /></td>
								<td>&emsp;</td>
								<td></td>
								<td></td>

							</tr>
						</table>
					</form>
					</br> </br>
					<div class="table-wrapper">
						<table class="data">
							<tr>
								<td class="cs_save_grid">Doctor Name</td>
								<td class="cs_save_grid">Registration No</td>
								<td class="cs_save_grid">Specialisation</td>
								<td class="cs_save_grid">Hospital</td>
								<td class="cs_save_grid">Clinic Date</td>
							</tr>

                            <form id="appoitmentRegistrationForm">
							<s:iterator value="allClinicList">
								<tr>
									<td class="dynamic_grid"><input id="clg_1_doctor_name<s:property value="clinicId" />" class="dynamic_grid"
										type="text" value="<s:property
									    value="doctorName" />" /></td>

									<td class="dynamic_grid"><input id="clg_1_reg_number<s:property value="clinicId" />" class="dynamic_grid"
										type="text" value="<s:property
									    value="registrationNumbfetchAppointmentser" />" /></td>

									<td class="dynamic_grid"><input id="clg_1_specialisation<s:property value="clinicId" />"
										class="dynamic_grid" type="text" value="<s:property
									    value="specialityCode" />" /></td>

									<td class="dynamic_grid"><input id="clg_1_channel_center_name<s:property value="clinicId" />"
										class="dynamic_grid" type="text" value="<s:property
									    value="channelCenterName" />" /></td>

									<td class="dynamic_grid"><input id="clg_1_date_from<s:property value="clinicId" />" class="dynamic_grid"
										type="text" value="<s:property
									    value="dateFrom" />" /></td>

									<td class="myx"><input class="myx" type="button"
										onclick="appointmentProceed(
										document.getElementById('clinic_id_pl<s:property value="clinicId" />').value, 
										document.getElementById('speciality_id_pl<s:property value="clinicId" />').value, 
										document.getElementById('doctor_id_pl<s:property value="clinicId" />').value, 
										document.getElementById('cc_id_pl<s:property value="clinicId" />').value,
										document.getElementById('location_pl<s:property value="clinicId" />').value,
										document.getElementById('clg_1_date_from<s:property value="clinicId" />').value)" />
									</td>

									<td class="myx"><input type="hidden" name="clinicId"        id="clinic_id_pl<s:property value="clinicId"/>"     value="<s:property value="clinicId" />" /> 
									                <input type="hidden" name="specialityId"    id="speciality_id_pl<s:property value="clinicId"/>" value="<s:property value="specialityId" />" /> 
									                <input type="hidden" name="doctorId"        id="doctor_id_pl<s:property value="clinicId"/>"     value="<s:property value="doctorId" />" /> 
									                <input type="hidden" name="channelCenterId" id="cc_id_pl<s:property value="clinicId"/>"         value="<s:property value="channelCenterId" />" />
									                <input type="hidden" name="dateFrom"        id="date_from_pl<s:property value="clinicId"/>"     value="<s:property value="dateFrom" />" />  
									                <input type="hidden"                        id="location_pl<s:property value="clinicId"/>"      value="<s:property value="address"/>" />
								    </td>
								</tr>
							</s:iterator>
                         </form>

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