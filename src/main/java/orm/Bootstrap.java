package orm;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Bootstrap {

	private final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();

	private SessionFactory sessionFactory;	
	public Bootstrap() {

		String sqlScript = "CREATE DATABASE  IF NOT EXISTS `university` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;\r\n" + 
				"USE `university`;\r\n" + 
				"-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)\r\n" + 
				"--\r\n" + 
				"-- Host: localhost    Database: university\r\n" + 
				"-- ------------------------------------------------------\r\n" + 
				"-- Server version	8.0.13\r\n" + 
				"\r\n" + 
				"/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;\r\n" + 
				"/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;\r\n" + 
				"/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;\r\n" + 
				" SET NAMES utf8 ;\r\n" + 
				"/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;\r\n" + 
				"/*!40103 SET TIME_ZONE='+00:00' */;\r\n" + 
				"/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;\r\n" + 
				"/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;\r\n" + 
				"/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;\r\n" + 
				"/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;\r\n" + 
				"\r\n" + 
				"--\r\n" + 
				"-- Table structure for table `course`\r\n" + 
				"--\r\n" + 
				"\r\n" + 
				"DROP TABLE IF EXISTS `course`;\r\n" + 
				"/*!40101 SET @saved_cs_client     = @@character_set_client */;\r\n" + 
				" SET character_set_client = utf8mb4 ;\r\n" + 
				"CREATE TABLE `course` (\r\n" + 
				"  `courseId` varchar(10) NOT NULL,\r\n" + 
				"  `name` varchar(45) DEFAULT NULL,\r\n" + 
				"  `description` varchar(45) DEFAULT NULL,\r\n" + 
				"  `schedule` varchar(20) DEFAULT NULL,\r\n" + 
				"  `room` varchar(10) DEFAULT NULL,\r\n" + 
				"  `seats` int(11) DEFAULT NULL,\r\n" + 
				"  `profId` int(11) DEFAULT NULL,\r\n" + 
				"  `currentSize` int(11) DEFAULT NULL,\r\n" + 
				"  PRIMARY KEY (`courseId`),\r\n" + 
				"  UNIQUE KEY `courseId_UNIQUE` (`courseId`)\r\n" + 
				") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;\r\n" + 
				"/*!40101 SET character_set_client = @saved_cs_client */;\r\n" + 
				"\r\n" + 
				"--\r\n" + 
				"-- Dumping data for table `course`\r\n" + 
				"--\r\n" + 
				"\r\n" + 
				"LOCK TABLES `course` WRITE;\r\n" + 
				"/*!40000 ALTER TABLE `course` DISABLE KEYS */;\r\n" + 
				"INSERT INTO `course` VALUES ('CS110','Intro to Computer Science','Hello computers','MWF11-1230','IC123',4,11123,4),('CS440','Aritificial Intelligence','THE ROBOTS ARE COMING','TTh3-420','IC125',6,11123,1),('PHIL221','Feminist Thoughht and Its Critics','The world is a nightmare','MWF10-11','IC124',20,11123,2);\r\n" + 
				"/*!40000 ALTER TABLE `course` ENABLE KEYS */;\r\n" + 
				"UNLOCK TABLES;\r\n" + 
				"\r\n" + 
				"--\r\n" + 
				"-- Table structure for table `enrolled`\r\n" + 
				"--\r\n" + 
				"\r\n" + 
				"DROP TABLE IF EXISTS `enrolled`;\r\n" + 
				"/*!40101 SET @saved_cs_client     = @@character_set_client */;\r\n" + 
				" SET character_set_client = utf8mb4 ;\r\n" + 
				"CREATE TABLE `enrolled` (\r\n" + 
				"  `stuId` int(11) NOT NULL,\r\n" + 
				"  `courseId` varchar(10) NOT NULL,\r\n" + 
				"  PRIMARY KEY (`stuId`,`courseId`),\r\n" + 
				"  KEY `courseId_idx` (`courseId`),\r\n" + 
				"  CONSTRAINT `courseId` FOREIGN KEY (`courseId`) REFERENCES `course` (`courseid`) ON DELETE CASCADE ON UPDATE CASCADE,\r\n" + 
				"  CONSTRAINT `stuId` FOREIGN KEY (`stuId`) REFERENCES `student` (`stuid`) ON DELETE CASCADE ON UPDATE CASCADE\r\n" + 
				") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;\r\n" + 
				"/*!40101 SET character_set_client = @saved_cs_client */;\r\n" + 
				"\r\n" + 
				"--\r\n" + 
				"-- Dumping data for table `enrolled`\r\n" + 
				"--\r\n" + 
				"\r\n" + 
				"LOCK TABLES `enrolled` WRITE;\r\n" + 
				"/*!40000 ALTER TABLE `enrolled` DISABLE KEYS */;\r\n" + 
				"INSERT INTO `enrolled` VALUES (1,'CS110'),(32924,'CS110'),(93290,'CS110'),(599143,'CS110'),(12345,'CS440'),(93290,'PHIL221'),(599143,'PHIL221');\r\n" + 
				"/*!40000 ALTER TABLE `enrolled` ENABLE KEYS */;\r\n" + 
				"UNLOCK TABLES;\r\n" + 
				"\r\n" + 
				"--\r\n" + 
				"-- Table structure for table `student`\r\n" + 
				"--\r\n" + 
				"\r\n" + 
				"DROP TABLE IF EXISTS `student`;\r\n" + 
				"/*!40101 SET @saved_cs_client     = @@character_set_client */;\r\n" + 
				" SET character_set_client = utf8mb4 ;\r\n" + 
				"CREATE TABLE `student` (\r\n" + 
				"  `stuId` int(11) NOT NULL,\r\n" + 
				"  `email` varchar(45) DEFAULT NULL,\r\n" + 
				"  `box` int(11) DEFAULT NULL,\r\n" + 
				"  `name` varchar(45) DEFAULT NULL,\r\n" + 
				"  `classification` varchar(10) DEFAULT NULL,\r\n" + 
				"  PRIMARY KEY (`stuId`),\r\n" + 
				"  UNIQUE KEY `stuId_UNIQUE` (`stuId`),\r\n" + 
				"  UNIQUE KEY `box_UNIQUE` (`box`),\r\n" + 
				"  UNIQUE KEY `email_UNIQUE` (`email`)\r\n" + 
				") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;\r\n" + 
				"/*!40101 SET character_set_client = @saved_cs_client */;\r\n" + 
				"\r\n" + 
				"--\r\n" + 
				"-- Dumping data for table `student`\r\n" + 
				"--\r\n" + 
				"\r\n" + 
				"LOCK TABLES `student` WRITE;\r\n" + 
				"/*!40000 ALTER TABLE `student` DISABLE KEYS */;\r\n" + 
				"INSERT INTO `student` VALUES (1,'mhiggs@ac.edu',83372,'Michael L Higgs','Sophomore'),(12345,'zaamold@ac.edu',9080,'Zach M Aamold','Junior'),(32924,'jhefele@ttu.edu',38293,'Jenna F Hefele','Senior'),(93290,'jsalter@ac.edu',98765,'Josh B Salter','Senior'),(599143,'rfasullo@ac.edu',60204,'Rosie B Fasullo','Senior');\r\n" + 
				"/*!40000 ALTER TABLE `student` ENABLE KEYS */;\r\n" + 
				"UNLOCK TABLES;\r\n" + 
				"/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;\r\n" + 
				"\r\n" + 
				"/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;\r\n" + 
				"/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;\r\n" + 
				"/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;\r\n" + 
				"/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;\r\n" + 
				"/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;\r\n" + 
				"/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;\r\n" + 
				"/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;\r\n" + 
				"\r\n" + 
				"-- Dump completed on 2018-12-10 11:01:49\r\n" + 
				"";
		

		try {
			sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
			System.out.println("session factory good.");
			
			Session session = sessionFactory.openSession();
			EntityManager manager = session.getEntityManagerFactory().createEntityManager();
			Query q = manager.createNativeQuery("BEGIN" + sqlScript + " END" );
			q.executeUpdate();
		}
		catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
			// so destroy it manually.
			System.err.println("problem building session factory. "+e.getMessage());
			StandardServiceRegistryBuilder.destroy( registry );
		}

		
	}
}
