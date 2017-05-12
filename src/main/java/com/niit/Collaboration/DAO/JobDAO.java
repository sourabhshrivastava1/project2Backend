package com.niit.Collaboration.DAO;

import java.util.List;

import com.niit.Collaboration.model.Job;
import com.niit.Collaboration.model.JobApplication;
import com.niit.Collaboration.model.User;

public interface JobDAO {

	public List<Job>  getAllOpenedJobs();
	
	public Job getJobDetails(Job job);
	
public boolean save(Job job);

public boolean save(JobApplication jobApplication);
	
	public boolean updatejob(Job job);
	
	public boolean updatejob(JobApplication jobApplication);
	// select * from JobApplication where userId=?
	public List<Job>  getMyAppliedJobs(String userID);
	
	public JobApplication getJobApplication(String userID,Long jobID);
	
	public JobApplication getJobApplication(Long jobID);

	public Job get(String string);

	public List<Job> list();

	
	
	
}
