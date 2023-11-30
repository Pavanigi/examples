package com.example.mentorrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mentorentity.Mentor;

public interface MentorRepository extends JpaRepository<Mentor,Integer> {

}
