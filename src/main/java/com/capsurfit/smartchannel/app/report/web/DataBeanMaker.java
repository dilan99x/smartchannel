package com.capsurfit.smartchannel.app.report.web;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class DataBeanMaker {
    public ArrayList<DataBean> getDataBeanList() {
        ArrayList<DataBean> dataBeanList = new ArrayList<DataBean>();

        dataBeanList.add(produce("Albert Einstein", "Engineer", "Ulm", "Germany"));
        dataBeanList.add(produce("Alfred Hitchcock", "Movie Director", "London", "UK"));
        dataBeanList.add(produce("Wernher Von Braun", "Rocket Scientist", "Wyrzysk", "Poland (Previously Germany)"));
        dataBeanList.add(produce("Sigmund Freud", "Neurologist", "Pribor", "Czech Republic (Previously Austria)"));
        dataBeanList.add(produce("Mahatma Gandhi", "Lawyer", "Gujarat", "India"));
        dataBeanList.add(produce("Sachin Tendulkar", "Cricket Player", "Mumbai", "India"));
        dataBeanList.add(produce("Michael Schumacher", "F1 Racer", "Cologne", "Germany"));

        return dataBeanList;
    }

    public ArrayList<Test> getTestDataBeanList() {
        ArrayList<Test> dataBeanList = new ArrayList<Test>();

        dataBeanList.add(produce(new Timestamp(new Date().getTime()), "Doctor Name1", "KHS", "GP", 1));
        dataBeanList.add(produce(new Timestamp(new Date().getTime()), "Doctor Name2", "HHS", "GP", 2));
        dataBeanList.add(produce(new Timestamp(new Date().getTime()), "Doctor Name3", "KKS", "GP", 3));
        dataBeanList.add(produce(new Timestamp(new Date().getTime()), "Doctor Name4", "WHS", "GP", 4));
        dataBeanList.add(produce(new Timestamp(new Date().getTime()), "Doctor Name5", "KHK", "GP", 5));
        dataBeanList.add(produce(new Timestamp(new Date().getTime()), "Doctor Name6", "KHY", "GP", 6));
        dataBeanList.add(produce(new Timestamp(new Date().getTime()), "Doctor Name7", "KHO", "GP", 7));

        return dataBeanList;
    }


    private DataBean produce(String name, String occupation, String place, String country) {
        DataBean dataBean = new DataBean();

        dataBean.setName(name);
        dataBean.setOccupation(occupation);
        dataBean.setPlace(place);
        dataBean.setCountry(country);

        return dataBean;
    }

    private Test produce(Timestamp clinicDate, String doctorName, String governmentHospitalName, String speciality, Integer appoinmentNumber) {
        Test dataBean = new Test();

        dataBean.setClinicDate(clinicDate);
        dataBean.setDoctorName(doctorName);
        dataBean.setGovernmentHospitalName(governmentHospitalName);
        dataBean.setSpeciality(speciality);
        dataBean.setAppoinmentNumber(appoinmentNumber);

        return dataBean;
    }
}
