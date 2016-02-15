-- MySQL dump 10.13  Distrib 5.7.9, for osx10.9 (x86_64)
--
-- Host: localhost    Database: SunsetSummit
-- ------------------------------------------------------
-- Server version	5.7.10

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Lease`
--

DROP TABLE IF EXISTS `Lease`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Lease` (
  `LeaseId` int(10) NOT NULL,
  `ResidenceId` int(10) NOT NULL,
  `TenantId` int(10) NOT NULL,
  `Duration` int(5) DEFAULT NULL,
  `StartDate` date DEFAULT NULL,
  `EndDate` date DEFAULT NULL,
  PRIMARY KEY (`LeaseId`,`ResidenceId`,`TenantId`),
  KEY `FK_Lease` (`TenantId`),
  CONSTRAINT `FK_Lease` FOREIGN KEY (`TenantId`) REFERENCES `Tenant` (`TenantId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Lease`
--

LOCK TABLES `Lease` WRITE;
/*!40000 ALTER TABLE `Lease` DISABLE KEYS */;
INSERT INTO `Lease` VALUES (1,1,1,2,'2016-02-01','2017-01-31'),(2,2,2,1,'2015-12-01','2016-12-31'),(3,3,3,5,'2015-02-01','2016-02-01'),(4,4,4,1,'2015-12-01','2016-11-30'),(5,5,5,1,'2015-02-11','2015-02-12'),(6,6,6,1,'2015-02-11','2015-02-12'),(7,7,7,1,'2016-02-01','2017-01-31'),(8,8,8,1,'2016-02-01','2017-01-31'),(9,9,9,1,'2016-02-01','2017-01-31'),(10,10,10,1,'2016-02-01','2017-01-31'),(11,11,11,1,'2016-02-01','2017-01-31'),(12,12,12,1,'2016-02-01','2017-01-31'),(1345,1345,1345,1,'2016-12-01','2017-11-30');
/*!40000 ALTER TABLE `Lease` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-02-15 17:00:50