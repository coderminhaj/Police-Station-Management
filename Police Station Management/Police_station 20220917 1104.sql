-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.73-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema police_station
--

CREATE DATABASE IF NOT EXISTS police_station;
USE police_station;

--
-- Definition of table `case_information`
--

DROP TABLE IF EXISTS `case_information`;
CREATE TABLE `case_information` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `case_id` varchar(45) NOT NULL,
  `criminal_id` varchar(45) NOT NULL,
  `criminal_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `case_information`
--

/*!40000 ALTER TABLE `case_information` DISABLE KEYS */;
/*!40000 ALTER TABLE `case_information` ENABLE KEYS */;


--
-- Definition of table `court_details`
--

DROP TABLE IF EXISTS `court_details`;
CREATE TABLE `court_details` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `court_id` varchar(45) NOT NULL,
  `court_name` varchar(45) NOT NULL,
  `court_location` varchar(45) NOT NULL,
  `court_chief_justice` varchar(45) NOT NULL,
  `court_phone` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `court_details`
--

/*!40000 ALTER TABLE `court_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `court_details` ENABLE KEYS */;


--
-- Definition of table `crime_evidence_and_witness`
--

DROP TABLE IF EXISTS `crime_evidence_and_witness`;
CREATE TABLE `crime_evidence_and_witness` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `criminal_id` varchar(45) NOT NULL,
  `criminal_name` varchar(45) NOT NULL,
  `witness_id` varchar(45) NOT NULL,
  `witness_name` varchar(45) NOT NULL,
  `witness_location` varchar(45) NOT NULL,
  `witness_mobile` varchar(45) NOT NULL,
  `case_id` varchar(45) NOT NULL,
  `evidence_list` varchar(45) NOT NULL,
  `offence_time` varchar(45) NOT NULL,
  `offence_location` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `crime_evidence_and_witness`
--

/*!40000 ALTER TABLE `crime_evidence_and_witness` DISABLE KEYS */;
/*!40000 ALTER TABLE `crime_evidence_and_witness` ENABLE KEYS */;


--
-- Definition of table `crime_information`
--

DROP TABLE IF EXISTS `crime_information`;
CREATE TABLE `crime_information` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `crime_id` varchar(45) NOT NULL,
  `crime_category` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `crime_information`
--

/*!40000 ALTER TABLE `crime_information` DISABLE KEYS */;
/*!40000 ALTER TABLE `crime_information` ENABLE KEYS */;


--
-- Definition of table `criminal_information`
--

DROP TABLE IF EXISTS `criminal_information`;
CREATE TABLE `criminal_information` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `criminal_id` varchar(45) NOT NULL,
  `criminal_first_name` varchar(45) NOT NULL,
  `criminal_last_name` varchar(45) NOT NULL,
  `criminal_location` varchar(45) NOT NULL,
  `criminal_mobile` varchar(45) NOT NULL,
  `arrest_officer_id` varchar(45) NOT NULL,
  `arrest_officer_name` varchar(45) NOT NULL,
  `code_violation_under_section` varchar(45) NOT NULL,
  `crime_id` varchar(45) NOT NULL,
  `crime_types` varchar(45) NOT NULL,
  `crime_description` varchar(45) NOT NULL,
  `age` varchar(45) NOT NULL,
  `date_of_offence` varchar(45) NOT NULL,
  `date_of_report` varchar(45) NOT NULL,
  `case_no` varchar(45) NOT NULL,
  `case_status` varchar(45) NOT NULL,
  `arrested_or_not` varchar(45) NOT NULL,
  `challan_court_facing_status` varchar(45) NOT NULL,
  `police_id` varchar(45) NOT NULL,
  `arresting_time` varchar(45) NOT NULL,
  `time_of_crime` varchar(45) NOT NULL,
  `victim_id` varchar(45) NOT NULL,
  `station_id` varchar(45) NOT NULL,
  `father_name` varchar(45) NOT NULL,
  `prison_id` varchar(45) NOT NULL,
  `previous_crime_history` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `criminal_information`
--

/*!40000 ALTER TABLE `criminal_information` DISABLE KEYS */;
/*!40000 ALTER TABLE `criminal_information` ENABLE KEYS */;


--
-- Definition of table `dumpyard`
--

DROP TABLE IF EXISTS `dumpyard`;
CREATE TABLE `dumpyard` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `item_id` varchar(45) NOT NULL,
  `item_name` varchar(45) NOT NULL,
  `cease_date` varchar(45) NOT NULL,
  `cease_location` varchar(45) NOT NULL,
  `owner` varchar(45) NOT NULL,
  `owner_mobile` varchar(45) NOT NULL,
  `owner_location` varchar(45) NOT NULL,
  `dump_reason` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `dumpyard`
--

/*!40000 ALTER TABLE `dumpyard` DISABLE KEYS */;
/*!40000 ALTER TABLE `dumpyard` ENABLE KEYS */;


--
-- Definition of table `general_diary`
--

DROP TABLE IF EXISTS `general_diary`;
CREATE TABLE `general_diary` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `gd_no` varchar(45) NOT NULL,
  `victim_id` varchar(45) NOT NULL,
  `victim_name` varchar(45) NOT NULL,
  `police_id` varchar(45) NOT NULL,
  `gd_details` varchar(45) NOT NULL,
  `remarks` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `general_diary`
--

/*!40000 ALTER TABLE `general_diary` DISABLE KEYS */;
/*!40000 ALTER TABLE `general_diary` ENABLE KEYS */;


--
-- Definition of table `most_wanted`
--

DROP TABLE IF EXISTS `most_wanted`;
CREATE TABLE `most_wanted` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `mw_id` varchar(45) NOT NULL,
  `mw_name` varchar(45) NOT NULL,
  `mw_last_know_location` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `mw_last_known_phone` varchar(45) NOT NULL,
  `case_quantity` varchar(45) NOT NULL,
  `case_id` varchar(45) NOT NULL,
  `special_direction` varchar(45) NOT NULL,
  `remarks` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `most_wanted`
--

/*!40000 ALTER TABLE `most_wanted` DISABLE KEYS */;
/*!40000 ALTER TABLE `most_wanted` ENABLE KEYS */;


--
-- Definition of table `police_information`
--

DROP TABLE IF EXISTS `police_information`;
CREATE TABLE `police_information` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `police_id` varchar(45) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `office_phone` varchar(45) NOT NULL,
  `personal_phone` varchar(45) NOT NULL,
  `present_address` varchar(45) NOT NULL,
  `permanent_address` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `birth_date` varchar(45) NOT NULL,
  `department_id` varchar(45) NOT NULL,
  `department_name` varchar(45) NOT NULL,
  `batch_number` varchar(45) NOT NULL,
  `qualification` varchar(45) NOT NULL,
  `rank_id` varchar(45) NOT NULL,
  `role` varchar(45) NOT NULL,
  `staion_id` varchar(45) NOT NULL,
  `placement_date` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `weapon_id` varchar(45) NOT NULL,
  `weapon_serial` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `police_information`
--

/*!40000 ALTER TABLE `police_information` DISABLE KEYS */;
/*!40000 ALTER TABLE `police_information` ENABLE KEYS */;


--
-- Definition of table `police_rank`
--

DROP TABLE IF EXISTS `police_rank`;
CREATE TABLE `police_rank` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `rank_id` varchar(45) NOT NULL,
  `role` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `police_rank`
--

/*!40000 ALTER TABLE `police_rank` DISABLE KEYS */;
/*!40000 ALTER TABLE `police_rank` ENABLE KEYS */;


--
-- Definition of table `police_staion`
--

DROP TABLE IF EXISTS `police_staion`;
CREATE TABLE `police_staion` (
  `station_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `station_name` varchar(45) DEFAULT NULL,
  `station_location` varchar(45) DEFAULT NULL,
  `officer_incharge` varchar(45) DEFAULT NULL,
  `officer_id` int(11) DEFAULT NULL,
  `staion_location` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `area` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `prison_amount` varchar(45) DEFAULT NULL,
  `remarks` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`station_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `police_staion`
--

/*!40000 ALTER TABLE `police_staion` DISABLE KEYS */;
/*!40000 ALTER TABLE `police_staion` ENABLE KEYS */;


--
-- Definition of table `police_vehicles`
--

DROP TABLE IF EXISTS `police_vehicles`;
CREATE TABLE `police_vehicles` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `vehicle_id` varchar(45) NOT NULL,
  `vehicle_name` varchar(45) NOT NULL,
  `vehicle_serial` varchar(45) NOT NULL,
  `vehicle_type` varchar(45) NOT NULL,
  `vehicle_condition` varchar(45) NOT NULL,
  `vehicle_driver` varchar(45) NOT NULL,
  `driver_phone` varchar(45) NOT NULL,
  `vehicle_under_officer_id` varchar(45) NOT NULL,
  `vehicle_under_officer_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `police_vehicles`
--

/*!40000 ALTER TABLE `police_vehicles` DISABLE KEYS */;
/*!40000 ALTER TABLE `police_vehicles` ENABLE KEYS */;


--
-- Definition of table `post_mortem`
--

DROP TABLE IF EXISTS `post_mortem`;
CREATE TABLE `post_mortem` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `victim_id` varchar(45) NOT NULL,
  `victim_name` varchar(45) NOT NULL,
  `dom_name` varchar(45) NOT NULL,
  `post_mortem_date` datetime NOT NULL,
  `body_transfering_person` varchar(45) NOT NULL,
  `reason_of_death` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `post_mortem`
--

/*!40000 ALTER TABLE `post_mortem` DISABLE KEYS */;
/*!40000 ALTER TABLE `post_mortem` ENABLE KEYS */;


--
-- Definition of table `prison`
--

DROP TABLE IF EXISTS `prison`;
CREATE TABLE `prison` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `prison_id` varchar(45) NOT NULL,
  `prison_name` varchar(45) NOT NULL,
  `station_id` varchar(45) NOT NULL,
  `station_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `prison`
--

/*!40000 ALTER TABLE `prison` DISABLE KEYS */;
/*!40000 ALTER TABLE `prison` ENABLE KEYS */;


--
-- Definition of table `station_managers`
--

DROP TABLE IF EXISTS `station_managers`;
CREATE TABLE `station_managers` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `police_id` int(10) DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `department_code` int(10) DEFAULT NULL,
  `department_name` varchar(45) DEFAULT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `station_managers`
--

/*!40000 ALTER TABLE `station_managers` DISABLE KEYS */;
/*!40000 ALTER TABLE `station_managers` ENABLE KEYS */;


--
-- Definition of table `victim_information`
--

DROP TABLE IF EXISTS `victim_information`;
CREATE TABLE `victim_information` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `victim_id` varchar(45) NOT NULL,
  `victim_name` varchar(45) NOT NULL,
  `case_id` varchar(45) NOT NULL,
  `criminal_id` varchar(45) NOT NULL,
  `criminal_name` varchar(45) NOT NULL,
  `case_recieved_police_id` varchar(45) NOT NULL,
  `victim_phone` varchar(45) NOT NULL,
  `victim_location` varchar(45) NOT NULL,
  `gd_id` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `victim_information`
--

/*!40000 ALTER TABLE `victim_information` DISABLE KEYS */;
/*!40000 ALTER TABLE `victim_information` ENABLE KEYS */;


--
-- Definition of table `weapons`
--

DROP TABLE IF EXISTS `weapons`;
CREATE TABLE `weapons` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `weapon_id` varchar(45) NOT NULL,
  `weapon_name` varchar(45) NOT NULL,
  `weapon_type` varchar(45) NOT NULL,
  `weapon_serial` varchar(45) NOT NULL,
  `weapon_quantity` varchar(45) NOT NULL,
  `weapon_issue_date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `weapons`
--

/*!40000 ALTER TABLE `weapons` DISABLE KEYS */;
/*!40000 ALTER TABLE `weapons` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
