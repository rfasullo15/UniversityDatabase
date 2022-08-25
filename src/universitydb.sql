CREATE DATABASE  IF NOT EXISTS `university` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `university`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: university
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `course` (
  `courseId` varchar(10) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `schedule` varchar(20) DEFAULT NULL,
  `room` varchar(10) DEFAULT NULL,
  `seats` int(11) DEFAULT NULL,
  `profId` int(11) DEFAULT NULL,
  `currentSize` int(11) DEFAULT NULL,
  PRIMARY KEY (`courseId`),
  UNIQUE KEY `courseId_UNIQUE` (`courseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES ('CS110','Intro to Computer Science','Hello computers','MWF11-1230','IC123',4,11123,4),('CS440','Aritificial Intelligence','THE ROBOTS ARE COMING','TTh3-420','IC125',6,11123,1),('PHIL221','Feminist Thoughht and Its Critics','The world is a nightmare','MWF10-11','IC124',20,11123,2);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enrolled`
--

DROP TABLE IF EXISTS `enrolled`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `enrolled` (
  `stuId` int(11) NOT NULL,
  `courseId` varchar(10) NOT NULL,
  PRIMARY KEY (`stuId`,`courseId`),
  KEY `courseId_idx` (`courseId`),
  CONSTRAINT `courseId` FOREIGN KEY (`courseId`) REFERENCES `course` (`courseid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `stuId` FOREIGN KEY (`stuId`) REFERENCES `student` (`stuid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrolled`
--

LOCK TABLES `enrolled` WRITE;
/*!40000 ALTER TABLE `enrolled` DISABLE KEYS */;
INSERT INTO `enrolled` VALUES (1,'CS110'),(32924,'CS110'),(93290,'CS110'),(599143,'CS110'),(12345,'CS440'),(93290,'PHIL221'),(599143,'PHIL221');
/*!40000 ALTER TABLE `enrolled` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `student` (
  `stuId` int(11) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `box` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `classification` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`stuId`),
  UNIQUE KEY `stuId_UNIQUE` (`stuId`),
  UNIQUE KEY `box_UNIQUE` (`box`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'mhiggs@ac.edu',83372,'Michael L Higgs','Sophomore'),(12345,'zaamold@ac.edu',9080,'Zach M Aamold','Junior'),(32924,'jhefele@ttu.edu',38293,'Jenna F Hefele','Senior'),(93290,'jsalter@ac.edu',98765,'Josh B Salter','Senior'),(599143,'rfasullo@ac.edu',60204,'Rosie B Fasullo','Senior');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-10 11:01:49
