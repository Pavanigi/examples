package com.example.mentorservice;



import com.example.mentorentity.Mentor;



public interface MentorService {
	
	
	Mentor saveMentor(Mentor mentor);

    Mentor getMentorById(String code);

    


}
