-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 12, 2018 at 02:03 AM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `maildata`
--

-- --------------------------------------------------------

--
-- Table structure for table `addressbook`
--

CREATE TABLE IF NOT EXISTS `addressbook` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `author` varchar(30) DEFAULT NULL,
  `addr` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `addressbook`
--

INSERT INTO `addressbook` (`id`, `name`, `author`, `addr`) VALUES
(1, 'bentola', 'nexo', 'bentola@k.m'),
(2, 'bentola', 'nexo', 'nelson'),
(3, 'bentola', 'nelson', 'bentola@k.m'),
(4, 'nexo bentola', 'lynda@imail.org', 'bentola@imail.org'),
(5, 'lynda', 'bentola@imail.org', 'lynda@imail.org'),
(6, 'nexo bentola', 'lynda@imail.org', 'bentola@imail.org');

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin2018');

-- --------------------------------------------------------

--
-- Table structure for table `inbox`
--

CREATE TABLE IF NOT EXISTS `inbox` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `msgfrom` varchar(50) DEFAULT NULL,
  `msg_to` varchar(100) NOT NULL,
  `subject` varchar(50) DEFAULT NULL,
  `msg` varchar(300) DEFAULT NULL,
  `msgdate` varchar(50) DEFAULT NULL,
  `filename` varchar(50) DEFAULT NULL,
  `path` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `inbox`
--

INSERT INTO `inbox` (`id`, `msgfrom`, `msg_to`, `subject`, `msg`, `msgdate`, `filename`, `path`) VALUES
(1, 'nelson', 'nexo', 'mambo', 'hali vpi bana', '2/7/2018', 'IMG_20180527_155819.jpg', 'E:i-Mailwebimages\\IMG_20180527_155819.jpg'),
(2, 'lynda@imail.org', 'bentola@imail.org', 'on the go', 'when things are not okay try some pepper', '6/8/2018', 'bugle.png', 'E:i-Mailwebimages\\bugle.png'),
(3, 'lynda@imail.org', 'bentola@imail.org', 'on the go', 'things are not the same', '6/8/2018', '1globeimages0003.png', 'E:i-Mailwebimages\\1globeimages0003.png'),
(4, 'bentola@imail.org', 'lynda@imail.org', 'ok', 'When we look beyond the horizon we gaze at no one', '6/8/2018', '1globeimages0020.png', 'E:i-Mailwebimages\\1globeimages0020.png'),
(5, 'lynda@imail.org', 'trevor@imail.org', 'things not the same', 'run my friend', '0/8/2018', 'bump.png', 'E:i-Mailwebimages\\bump.png'),
(6, 'lynda@imail.org', 'bentola@imail.org', 'on the go', 'Things are ok', '0/8/2018', '1globeimages0018.png', 'E:i-Mailwebimages\\1globeimages0018.png');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE IF NOT EXISTS `register` (
  `full_name` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `dob` varchar(30) NOT NULL,
  `email_address` varchar(30) NOT NULL,
  `phone_number` varchar(30) NOT NULL,
  `staff_id` int(15) NOT NULL,
  `password` varchar(30) NOT NULL,
  `filename` varchar(200) DEFAULT NULL,
  `path` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `staff_id` (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`full_name`, `username`, `gender`, `dob`, `email_address`, `phone_number`, `staff_id`, `password`, `filename`, `path`) VALUES
('nexo bentola', 'bentola@imail.org', 'Male', '2018-08-15', 'nelsonex@gmail.com', '9007771', 6020, '1234qwer', 'rocket.png', 'E:i-Mailwebimages\\rocket.png'),
('lynda mwanzia', 'lynda@imail.org', 'Male', '1995-06-20', 'lynda@gmail.com', '0700263908', 1002, 'qwerty1', 'lily.png', 'E:i-Mailwebimages\\lily.png'),
('Trevor jumba', 'trevor@imail.org', 'Male', '455227', 'nsmsau', '9007771', 2000, 'trevor', 'WP_20180215_001.jpg', 'E:i-Mailwebimages\\WP_20180215_001.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `sent`
--

CREATE TABLE IF NOT EXISTS `sent` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `msg_from` varchar(200) NOT NULL,
  `msg_to` varchar(200) NOT NULL,
  `subject` varchar(200) NOT NULL,
  `message` varchar(500) NOT NULL,
  `date` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Dumping data for table `sent`
--

INSERT INTO `sent` (`id`, `msg_from`, `msg_to`, `subject`, `message`, `date`) VALUES
(3, 'bentola', 'nexo', 'pompei', 'wacha', '0/7/2018'),
(4, 'bentola', 'nexo', 'pompei', 'wacha', '0/7/2018'),
(5, 'bentox', 'nexo', 'amazing', 'things go on well enough', '1/7/2018'),
(6, 'bentox', 'nexo', 'oyeah', 'in particular', '1/7/2018'),
(7, 'bentox', 'nexo', 'oyeah', 'in particular', '1/7/2018'),
(8, 'nexo', 'bentox', 'pompei', 'qerty', '1/7/2018'),
(9, 'nelson', 'nexo', 'mambo', 'hali vpi bana', '2/7/2018'),
(10, 'lynda@imail.org', 'bentola@imail.org', 'on the go', 'when things are not okay try some pepper', '6/8/2018'),
(12, 'bentola@imail.org', 'lynda@imail.org', 'ok', 'When we look beyond the horizon we gaze at no one', '6/8/2018'),
(13, 'lynda@imail.org', 'trevor@imail.org', 'things not the same', 'run my friend', '0/8/2018');

-- --------------------------------------------------------

--
-- Table structure for table `spam`
--

CREATE TABLE IF NOT EXISTS `spam` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `msgto` varchar(50) NOT NULL,
  `msgfrom` varchar(50) NOT NULL,
  `subject` varchar(50) NOT NULL,
  `msg` varchar(50) NOT NULL,
  `msgdate` varchar(50) NOT NULL,
  `filename` varchar(50) NOT NULL,
  `path` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `staff_id`
--

CREATE TABLE IF NOT EXISTS `staff_id` (
  `full_name` varchar(50) NOT NULL,
  `staff_id` int(50) NOT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff_id`
--

INSERT INTO `staff_id` (`full_name`, `staff_id`) VALUES
('lynda mwanzia', 1002),
('Sheilah muhonja', 1020),
('Trevor Jumba', 2000),
('lawrence mbithi', 2030),
('david njue', 3001),
('lewis okerio', 3490),
('nexo bentola', 6020);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `register`
--
ALTER TABLE `register`
  ADD CONSTRAINT `register_ibfk_1` FOREIGN KEY (`staff_id`) REFERENCES `staff_id` (`staff_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
