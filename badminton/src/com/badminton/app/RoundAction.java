package com.badminton.app;

import java.sql.Date;
//import java.util.ArrayList;

//import badminton.server.entity.Athlete;

import com.badminton.service.RoundService;
import com.badminton.service.impl.RoundServiceImpl;

public class RoundAction {

	RoundService roundservice=new RoundServiceImpl();

	//�����¼�¼
	public boolean roundAdd(String round_id,int coach_id,String stat_id,int serve_athleteId,int last_beat_athleteId,int score_Num,int score_den,int initiative,int serve_drop_area,
			   int catch_drop_area,int last_beat_drop_area,int gain,String gamename,Date gamedate,String gameaddress,String athletename){
		return roundservice.roundAdd(round_id,coach_id,stat_id,serve_athleteId,last_beat_athleteId,score_Num,score_den,initiative,serve_drop_area,catch_drop_area,
				   last_beat_drop_area,gain,gamename,gamedate,gameaddress,athletename);
	}
	
}
