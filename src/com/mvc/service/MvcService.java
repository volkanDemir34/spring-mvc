package com.mvc.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.security.Permission;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mvc.dao.MyEntityDAoO;
import com.mvc.model.MyEntity;
import com.mvc.model.User;

@Service
public class MvcService {

	@Autowired
	MyEntityDAoO dao;
	
	public void goster() {
		System.out.println("volkan");
	}
	
	public void insert() {
		MyEntity ent = new MyEntity();
		ent.setDate(LocalDate.now());
		ent.setDateTime(LocalDateTime.now());
		dao.save(ent);
	}


}