-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 2020-06-16 14:31:11
-- 服务器版本： 5.5.62-log
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mooc`
--

-- --------------------------------------------------------

--
-- 表的结构 `mclass_answer`
--

CREATE TABLE `mclass_answer` (
  `id` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL,
  `examination_record_id` bigint(20) DEFAULT NULL,
  `is_right` tinyint(3) UNSIGNED DEFAULT '0',
  `status` int(11) DEFAULT NULL,
  `subject_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `mclass_answer`
--

INSERT INTO `mclass_answer` (`id`, `create_time`, `update_time`, `answer`, `examination_record_id`, `is_right`, `status`, `subject_id`, `user_id`) VALUES
(1, '2020-05-18 22:37:38', '2020-05-18 22:37:38', '填空题答案_UNIT_TEST', 1, 1, 1, 4, 2),
(2, '2020-05-18 22:37:38', '2020-05-18 22:37:38', 'B', 1, 0, 1, 5, 2),
(3, '2020-05-18 22:37:38', '2020-05-18 22:37:38', 'false', 1, 1, 1, 6, 2),
(4, '2020-05-18 22:37:39', '2020-05-18 22:37:39', '填空题答案_UNIT_TEST', 2, 1, 1, 4, 3),
(5, '2020-05-18 22:37:39', '2020-05-18 22:37:39', 'A,B', 2, 1, 1, 5, 3),
(6, '2020-05-18 22:37:39', '2020-05-18 22:37:39', 'false', 2, 1, 1, 6, 3);

-- --------------------------------------------------------

--
-- 表的结构 `mclass_attendance`
--

CREATE TABLE `mclass_attendance` (
  `id` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `check_in_id` bigint(20) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `latitude` decimal(5,2) DEFAULT NULL,
  `longitude` decimal(5,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- 表的结构 `mclass_check_in`
--

CREATE TABLE `mclass_check_in` (
  `id` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `absence_count` int(11) DEFAULT NULL,
  `checked_count` int(11) DEFAULT NULL,
  `deadline` datetime DEFAULT NULL,
  `is_gps` bit(1) DEFAULT NULL,
  `late_count` int(11) DEFAULT NULL,
  `latitude` decimal(5,2) DEFAULT NULL,
  `lesson_id` bigint(20) DEFAULT NULL,
  `longitude` decimal(5,2) DEFAULT NULL,
  `status` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- 表的结构 `mclass_choice`
--

CREATE TABLE `mclass_choice` (
  `choice_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `mclass_choice`
--

INSERT INTO `mclass_choice` (`choice_id`) VALUES
(2),
(5),
(74),
(77);

-- --------------------------------------------------------

--
-- 表的结构 `mclass_class_user`
--

CREATE TABLE `mclass_class_user` (
  `mooc_class_id` bigint(20) NOT NULL,
  `users_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `mclass_class_user`
--

INSERT INTO `mclass_class_user` (`mooc_class_id`, `users_id`) VALUES
(1, 2),
(1, 3);

-- --------------------------------------------------------

--
-- 表的结构 `mclass_course`
--

CREATE TABLE `mclass_course` (
  `id` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `teacher_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `mclass_course`
--

INSERT INTO `mclass_course` (`id`, `create_time`, `update_time`, `name`, `type`, `teacher_id`) VALUES
(1, '2020-05-18 22:29:59', '2020-05-18 22:29:59', 'Java企业版课程', 2, 1);

-- --------------------------------------------------------

--
-- 表的结构 `mclass_examination`
--

CREATE TABLE `mclass_examination` (
  `id` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `lesson_id` bigint(20) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `submit_count` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `mclass_examination`
--

INSERT INTO `mclass_examination` (`id`, `create_time`, `update_time`, `lesson_id`, `name`, `status`, `submit_count`) VALUES
(1, '2020-05-18 22:34:37', '2020-05-18 22:37:39', 1, '课程引论测验', 2, 2);

-- --------------------------------------------------------

--
-- 表的结构 `mclass_examination_record`
--

CREATE TABLE `mclass_examination_record` (
  `id` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `correct_count` int(11) DEFAULT NULL,
  `examination_id` bigint(20) DEFAULT NULL,
  `score` decimal(5,2) DEFAULT NULL,
  `submit_time` datetime DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `mclass_examination_record`
--

INSERT INTO `mclass_examination_record` (`id`, `create_time`, `update_time`, `correct_count`, `examination_id`, `score`, `submit_time`, `user_id`) VALUES
(1, '2020-05-18 22:37:38', '2020-05-18 22:37:38', 2, 1, '20.00', '2020-05-18 22:37:38', 2),
(2, '2020-05-18 22:37:39', '2020-05-18 22:37:39', 3, 1, '30.00', '2020-05-18 22:37:39', 3);

-- --------------------------------------------------------

--
-- 表的结构 `mclass_exercise`
--

CREATE TABLE `mclass_exercise` (
  `id` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `course_id` bigint(20) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `mclass_exercise`
--

INSERT INTO `mclass_exercise` (`id`, `create_time`, `update_time`, `course_id`, `name`) VALUES
(1, '2020-05-18 22:31:18', '2020-05-18 22:31:18', 1, '课程引论作业'),
(4, '2020-06-11 22:35:01', '2020-06-11 22:35:01', 1, '作业2'),
(5, '2020-06-12 00:29:43', '2020-06-12 00:29:43', 1, '作业3');

-- --------------------------------------------------------

--
-- 表的结构 `mclass_fill`
--

CREATE TABLE `mclass_fill` (
  `decimal_key` varchar(255) DEFAULT NULL,
  `key_type` int(11) DEFAULT NULL,
  `match_type` int(11) DEFAULT NULL,
  `text_key` varchar(255) DEFAULT NULL,
  `is_unique` tinyint(3) UNSIGNED DEFAULT '0',
  `fill_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `mclass_fill`
--

INSERT INTO `mclass_fill` (`decimal_key`, `key_type`, `match_type`, `text_key`, `is_unique`, `fill_id`) VALUES
(NULL, 2, 1, '填空题答案_UNIT_TEST', 1, 1),
(NULL, 2, 1, '填空题答案_UNIT_TEST', 1, 4),
('618', 1, 1, '文字格式答案', 1, 73),
('123456', 1, 1, NULL, 1, 78),
(NULL, 2, 1, '加油北京', 1, 79),
(NULL, 2, 1, '加油北京', 1, 80);

-- --------------------------------------------------------

--
-- 表的结构 `mclass_judgment`
--

CREATE TABLE `mclass_judgment` (
  `false_count` int(11) DEFAULT NULL,
  `result` tinyint(3) UNSIGNED DEFAULT '0',
  `true_count` int(11) DEFAULT NULL,
  `judgment_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `mclass_judgment`
--

INSERT INTO `mclass_judgment` (`false_count`, `result`, `true_count`, `judgment_id`) VALUES
(0, 1, 0, 59),
(0, 1, 0, 75),
(0, 1, 0, 76);

-- --------------------------------------------------------

--
-- 表的结构 `mclass_lesson`
--

CREATE TABLE `mclass_lesson` (
  `id` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `mooc_class_id` bigint(20) DEFAULT NULL,
  `service_date` datetime DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `check_in_id` bigint(20) DEFAULT NULL,
  `examination_count` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `mclass_lesson`
--

INSERT INTO `mclass_lesson` (`id`, `create_time`, `update_time`, `end_time`, `mooc_class_id`, `service_date`, `start_time`, `status`, `check_in_id`, `examination_count`) VALUES
(1, '2020-05-18 22:34:10', '2020-05-18 22:38:25', '2020-05-18 22:38:25', 1, '2020-05-18 22:33:53', '2020-05-18 22:35:02', 3, NULL, NULL);

-- --------------------------------------------------------

--
-- 表的结构 `mclass_mooc_class`
--

CREATE TABLE `mclass_mooc_class` (
  `id` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `offline_course` varchar(255) DEFAULT NULL,
  `semester` varchar(255) DEFAULT NULL,
  `year` varchar(255) DEFAULT NULL,
  `weekday` varchar(255) DEFAULT NULL,
  `course_id` bigint(20) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `mclass_mooc_class`
--

INSERT INTO `mclass_mooc_class` (`id`, `create_time`, `update_time`, `name`, `offline_course`, `semester`, `year`, `weekday`, `course_id`, `code`) VALUES
(1, '2020-05-18 22:29:59', '2020-05-18 22:29:59', 'Java企业版研究生课堂', 'Java企业版课程', '春季', '2020', '周三/周五', 1, 'R4MOLF');

-- --------------------------------------------------------

--
-- 表的结构 `mclass_notice`
--

CREATE TABLE `mclass_notice` (
  `id` bigint(20) NOT NULL,
  `course_id` bigint(20) NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  `title` varchar(256) NOT NULL,
  `url` varchar(512) DEFAULT NULL,
  `image` varchar(256) DEFAULT NULL,
  `content` text NOT NULL,
  `status` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `mclass_notice`
--

INSERT INTO `mclass_notice` (`id`, `course_id`, `create_time`, `update_time`, `title`, `url`, `image`, `content`, `status`) VALUES
(1, 1, '2020-06-11 00:00:00', '2020-06-15 16:37:02', '这是编辑后公告标题3', '/notice/detail/1', '/images/1.png', '这是编辑后公告内容3', 1),
(4, 1, '2020-06-15 22:20:40', '2020-06-15 22:21:44', '这是编辑后公告标题4', '/notice/detail/1', '/images/1.png', '这是编辑后公告内容4', 1);

-- --------------------------------------------------------

--
-- 表的结构 `mclass_option`
--

CREATE TABLE `mclass_option` (
  `id` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `is_correct` tinyint(3) UNSIGNED DEFAULT '0',
  `count` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `choice_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `mclass_option`
--

INSERT INTO `mclass_option` (`id`, `create_time`, `update_time`, `content`, `is_correct`, `count`, `name`, `choice_id`) VALUES
(1, '2020-05-18 22:33:22', '2020-05-18 22:33:22', '选项A_UNIT_TEST', 1, 0, 'A', 2),
(2, '2020-05-18 22:33:22', '2020-05-18 22:33:22', '选项B_UNIT_TEST', 1, 0, 'B', 2),
(3, '2020-05-18 22:34:37', '2020-05-18 22:37:39', '选项A_UNIT_TEST', 1, 1, 'A', 5),
(4, '2020-05-18 22:34:37', '2020-05-18 22:37:39', '选项B_UNIT_TEST', 1, 2, 'B', 5),
(47, '2020-06-16 13:56:44', '2020-06-16 13:56:44', '选项内容1', 1, 0, 'A11', 74),
(48, '2020-06-16 14:10:18', '2020-06-16 14:10:18', '选项A_UNIT_TEST', 0, 0, 'A', 77),
(49, '2020-06-16 14:10:18', '2020-06-16 14:10:18', '选项B_UNIT_TEST', 0, 0, 'B', 77),
(50, '2020-06-16 14:10:18', '2020-06-16 14:10:18', '选项C_UNIT_TEST', 1, 0, 'C', 77),
(51, '2020-06-16 14:10:18', '2020-06-16 14:10:18', '选项D_UNIT_TEST', 0, 0, 'D', 77);

-- --------------------------------------------------------

--
-- 表的结构 `mclass_subject`
--

CREATE TABLE `mclass_subject` (
  `id` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `error_count` int(11) DEFAULT NULL,
  `error_percent` int(11) DEFAULT NULL,
  `examination_id` bigint(20) DEFAULT NULL,
  `exercise_id` bigint(20) DEFAULT NULL,
  `right_count` int(11) DEFAULT NULL,
  `right_percent` int(11) DEFAULT NULL,
  `score` decimal(5,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `mclass_subject`
--

INSERT INTO `mclass_subject` (`id`, `create_time`, `update_time`, `content`, `error_count`, `error_percent`, `examination_id`, `exercise_id`, `right_count`, `right_percent`, `score`) VALUES
(1, '2020-05-18 22:33:22', '2020-05-18 22:33:22', '填空题题干_UNIT_TEST', 0, NULL, NULL, 1, 0, NULL, '10.00'),
(2, '2020-05-18 22:33:22', '2020-05-18 22:33:22', '选择题题干_UNIT_TEST', 0, NULL, NULL, 1, 0, NULL, '10.00'),
(4, '2020-05-18 22:34:37', '2020-05-18 22:37:39', '填空题题干_UNIT_TEST', 0, 0, 1, NULL, 2, 100, '10.00'),
(5, '2020-05-18 22:34:37', '2020-05-18 22:37:39', '选择题题干_UNIT_TEST', 1, 50, 1, NULL, 1, 50, '10.00'),
(59, '2020-06-12 00:19:43', '2020-06-12 00:19:43', '判断题内容哈', 0, 0, NULL, 1, 0, 0, '10.00'),
(73, '2020-06-16 13:54:39', '2020-06-16 13:54:39', '这是填空题干内容', 0, NULL, 1, 1, 0, NULL, '10.00'),
(74, '2020-06-16 13:56:44', '2020-06-16 13:56:44', '这是选择题干内容', 0, NULL, 1, 1, 0, NULL, '10.00'),
(75, '2020-06-16 14:06:39', '2020-06-16 14:06:39', '这是判断题题干内容6188', 0, NULL, NULL, 1, 0, NULL, '10.00'),
(76, '2020-06-16 14:10:06', '2020-06-16 14:10:06', '这是判断题题干内容548', 0, NULL, NULL, 1, 0, NULL, '10.00'),
(77, '2020-06-16 14:10:18', '2020-06-16 14:10:18', '单项选择题题干618_答案_D_UNIT_TEST', 0, NULL, NULL, 1, 0, NULL, '10.00'),
(78, '2020-06-16 14:15:10', '2020-06-16 14:15:10', '填空题题干asd_答案_123456_UNIT_TEST', 0, NULL, NULL, 1, 0, NULL, '10.00'),
(79, '2020-06-16 14:15:32', '2020-06-16 14:15:32', '填空题题干asdasd_答案_加油武汉_UNIT_TEST', 0, NULL, NULL, 1, 0, NULL, '10.00'),
(80, '2020-06-16 14:15:59', '2020-06-16 14:15:59', '填空题题干asdasd_答案_加油武汉_UNIT_TEST', 0, NULL, NULL, 1, 0, NULL, '10.00');

-- --------------------------------------------------------

--
-- 表的结构 `upms_role`
--

CREATE TABLE `upms_role` (
  `id` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `upms_role`
--

INSERT INTO `upms_role` (`id`, `create_time`, `update_time`, `name`) VALUES
(1, '2020-05-28 11:56:29', '2020-05-28 11:56:33', 'ROLE_ADMIN'),
(2, '2020-05-28 11:57:48', '2020-05-28 11:57:53', 'ROLE_TEACHER'),
(3, '2020-05-28 11:58:08', '2020-05-28 11:58:13', 'ROLE_STUDENT');

-- --------------------------------------------------------

--
-- 表的结构 `upms_user`
--

CREATE TABLE `upms_user` (
  `discriminator` varchar(30) NOT NULL,
  `id` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(20) NOT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `student_no` varchar(255) DEFAULT NULL,
  `salary_no` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `upms_user`
--

INSERT INTO `upms_user` (`discriminator`, `id`, `create_time`, `update_time`, `email`, `name`, `nickname`, `password`, `student_no`, `salary_no`, `title`) VALUES
('Teacher', 1, '2020-05-28 12:07:54', '2020-06-15 17:24:57', 'teacher_jacky@qq.com', 'teacher2', 'teacher2', '$2a$10$RbtVO746QhU.7/H.XWKV/O3kXwCmM8QoMs8ejbQTe3agZx8EjERlS', NULL, '1009999', ''),
('Student', 2, '2020-05-28 12:07:54', '2020-05-28 12:07:54', '321@qq.com', 'xes1', '薛而思', '$2a$10$uroWnaejLvkkkIaeGiIhD.LX0kOFIueVDFDepcRcBevXOe6AEx4hu', '201912345601', NULL, NULL),
('Student', 3, '2020-05-28 12:07:54', '2020-05-28 12:07:54', '322@qq.com', 'xdf1', '信东方', '$2a$10$m5VQySl.MPoxe4jZUQd40efYttwUuH67ImomSGH6PgE5OqJyhc/YC', '201912345602', NULL, NULL),
('Student', 6, '2020-06-10 22:08:10', '2020-06-10 22:08:10', 'string', 'string', 'string', '$2a$10$OAPkf/q8thuzHbbAbkqPJu0v4QapArB.ZGxUZ4pkgAGUNLLmB3Itu', 'string', NULL, NULL),
('Student', 7, '2020-06-10 22:34:03', '2020-06-10 22:34:03', 'string', 'stringd', 'string', '$2a$10$zkWvblgbvyrjItZv496MvOaiRchSqVFry2/qas06pXFTrpScMmppa', 'string', NULL, NULL),
('Student', 8, '2020-06-10 23:08:38', '2020-06-10 23:08:38', 'jacky123456@qq.com', 'jacky', 'jacky', '$2a$10$mV2nPcLOELlS7D34v2QVZuAUUmEXwETLEziHn89/LHKhA7GqoJmqi', '2019150001', NULL, NULL),
('Student', 9, '2020-06-15 18:01:11', '2020-06-15 18:01:11', 'student2@qq.com', 'student2', 'student2', '$2a$10$KhAieEDv8uF9w7J.fzPARODUOlqCT0mXPK9Xq7N5oeWZ7ExjXjsd2', '132132123244', NULL, NULL),
('Teacher', 10, '2020-06-15 18:04:48', '2020-06-15 18:04:48', 'teacher3@qq.com', 'teacher3', 'teacher3', '$2a$10$uQXCT9eAWxc41K6nBEXiWO9UZHH2UC5aIe3ZEPcch0VqJcy6zhtA6', NULL, '132132123244', '测试'),
('Admin', 12, '2020-06-15 18:23:02', '2020-06-15 18:23:02', 'admin1@qq.com', 'admin1', 'admin1', '$2a$10$gqAHK0d3ogRm/SA.J2AaPu.Xa1ogViz1oxSMvw/L4k.39XZffZS6i', NULL, '132132123115', '测试');

-- --------------------------------------------------------

--
-- 表的结构 `upms_user_r_role`
--

CREATE TABLE `upms_user_r_role` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转存表中的数据 `upms_user_r_role`
--

INSERT INTO `upms_user_r_role` (`user_id`, `role_id`) VALUES
(2, 3),
(3, 3),
(6, 3),
(7, 3),
(8, 3),
(1, 2),
(9, 3),
(10, 2),
(12, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mclass_answer`
--
ALTER TABLE `mclass_answer`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKak05md5crmt5h1vfrobmiwgt1` (`examination_record_id`);

--
-- Indexes for table `mclass_attendance`
--
ALTER TABLE `mclass_attendance`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4j2g19plyherqpn3w1rnfnv7o` (`user_id`),
  ADD KEY `FKrxtm0n53nqcoskln4ny96r04j` (`check_in_id`);

--
-- Indexes for table `mclass_check_in`
--
ALTER TABLE `mclass_check_in`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mclass_choice`
--
ALTER TABLE `mclass_choice`
  ADD PRIMARY KEY (`choice_id`);

--
-- Indexes for table `mclass_class_user`
--
ALTER TABLE `mclass_class_user`
  ADD KEY `FKfaxv8drigcod8wq6xyt836m27` (`users_id`),
  ADD KEY `FKccekm2qroa7vxdc5yitcadx2a` (`mooc_class_id`);

--
-- Indexes for table `mclass_course`
--
ALTER TABLE `mclass_course`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK6a8tuuij8qb7sh3365efhyj0v` (`teacher_id`);

--
-- Indexes for table `mclass_examination`
--
ALTER TABLE `mclass_examination`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKh6ci26ntg34iapoo2p7a5j6r6` (`lesson_id`);

--
-- Indexes for table `mclass_examination_record`
--
ALTER TABLE `mclass_examination_record`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK9smo6p5a3odet2kvub0tqay6j` (`user_id`);

--
-- Indexes for table `mclass_exercise`
--
ALTER TABLE `mclass_exercise`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mclass_fill`
--
ALTER TABLE `mclass_fill`
  ADD PRIMARY KEY (`fill_id`);

--
-- Indexes for table `mclass_judgment`
--
ALTER TABLE `mclass_judgment`
  ADD PRIMARY KEY (`judgment_id`);

--
-- Indexes for table `mclass_lesson`
--
ALTER TABLE `mclass_lesson`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKfay0v3u145ymqgfkfrlxki51` (`check_in_id`);

--
-- Indexes for table `mclass_mooc_class`
--
ALTER TABLE `mclass_mooc_class`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKhbruw69f379dlto1dmv62snsr` (`course_id`);

--
-- Indexes for table `mclass_notice`
--
ALTER TABLE `mclass_notice`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mclass_option`
--
ALTER TABLE `mclass_option`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKdva24lm5bx7qpbwi3q86ddqm` (`choice_id`);

--
-- Indexes for table `mclass_subject`
--
ALTER TABLE `mclass_subject`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK3tpqqo88sfcesfjj5ddljfia2` (`exercise_id`),
  ADD KEY `FKihb1sa66psshqpf8j249n04p8` (`examination_id`);

--
-- Indexes for table `upms_role`
--
ALTER TABLE `upms_role`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_4161wthcffavsu2im6s5sc41i` (`name`);

--
-- Indexes for table `upms_user`
--
ALTER TABLE `upms_user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_rms9jmyq5ysgxhkgy98ujd50i` (`name`);

--
-- Indexes for table `upms_user_r_role`
--
ALTER TABLE `upms_user_r_role`
  ADD KEY `FKjmjyy5bqjuh68rsqak8f3is7n` (`role_id`),
  ADD KEY `FKi81xsuu0y51hmufc0r5dh5dwk` (`user_id`);

--
-- 在导出的表使用AUTO_INCREMENT
--

--
-- 使用表AUTO_INCREMENT `mclass_answer`
--
ALTER TABLE `mclass_answer`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- 使用表AUTO_INCREMENT `mclass_attendance`
--
ALTER TABLE `mclass_attendance`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- 使用表AUTO_INCREMENT `mclass_check_in`
--
ALTER TABLE `mclass_check_in`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- 使用表AUTO_INCREMENT `mclass_course`
--
ALTER TABLE `mclass_course`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- 使用表AUTO_INCREMENT `mclass_examination`
--
ALTER TABLE `mclass_examination`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- 使用表AUTO_INCREMENT `mclass_examination_record`
--
ALTER TABLE `mclass_examination_record`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- 使用表AUTO_INCREMENT `mclass_exercise`
--
ALTER TABLE `mclass_exercise`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- 使用表AUTO_INCREMENT `mclass_lesson`
--
ALTER TABLE `mclass_lesson`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- 使用表AUTO_INCREMENT `mclass_mooc_class`
--
ALTER TABLE `mclass_mooc_class`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- 使用表AUTO_INCREMENT `mclass_notice`
--
ALTER TABLE `mclass_notice`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- 使用表AUTO_INCREMENT `mclass_option`
--
ALTER TABLE `mclass_option`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- 使用表AUTO_INCREMENT `mclass_subject`
--
ALTER TABLE `mclass_subject`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=82;

--
-- 使用表AUTO_INCREMENT `upms_role`
--
ALTER TABLE `upms_role`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- 使用表AUTO_INCREMENT `upms_user`
--
ALTER TABLE `upms_user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- 限制导出的表
--

--
-- 限制表 `mclass_answer`
--
ALTER TABLE `mclass_answer`
  ADD CONSTRAINT `FKak05md5crmt5h1vfrobmiwgt1` FOREIGN KEY (`examination_record_id`) REFERENCES `mclass_examination_record` (`id`);

--
-- 限制表 `mclass_attendance`
--
ALTER TABLE `mclass_attendance`
  ADD CONSTRAINT `FK4j2g19plyherqpn3w1rnfnv7o` FOREIGN KEY (`user_id`) REFERENCES `upms_user` (`id`),
  ADD CONSTRAINT `FKrxtm0n53nqcoskln4ny96r04j` FOREIGN KEY (`check_in_id`) REFERENCES `mclass_check_in` (`id`);

--
-- 限制表 `mclass_choice`
--
ALTER TABLE `mclass_choice`
  ADD CONSTRAINT `FKfg5fius08dpvuewa8oct72a5h` FOREIGN KEY (`choice_id`) REFERENCES `mclass_subject` (`id`);

--
-- 限制表 `mclass_class_user`
--
ALTER TABLE `mclass_class_user`
  ADD CONSTRAINT `FKccekm2qroa7vxdc5yitcadx2a` FOREIGN KEY (`mooc_class_id`) REFERENCES `mclass_mooc_class` (`id`),
  ADD CONSTRAINT `FKfaxv8drigcod8wq6xyt836m27` FOREIGN KEY (`users_id`) REFERENCES `upms_user` (`id`);

--
-- 限制表 `mclass_course`
--
ALTER TABLE `mclass_course`
  ADD CONSTRAINT `FK6a8tuuij8qb7sh3365efhyj0v` FOREIGN KEY (`teacher_id`) REFERENCES `upms_user` (`id`);

--
-- 限制表 `mclass_examination`
--
ALTER TABLE `mclass_examination`
  ADD CONSTRAINT `FKh6ci26ntg34iapoo2p7a5j6r6` FOREIGN KEY (`lesson_id`) REFERENCES `mclass_lesson` (`id`);

--
-- 限制表 `mclass_examination_record`
--
ALTER TABLE `mclass_examination_record`
  ADD CONSTRAINT `FK9smo6p5a3odet2kvub0tqay6j` FOREIGN KEY (`user_id`) REFERENCES `upms_user` (`id`);

--
-- 限制表 `mclass_fill`
--
ALTER TABLE `mclass_fill`
  ADD CONSTRAINT `FK15lge7ew3gfm9kbj9m0r6d9rb` FOREIGN KEY (`fill_id`) REFERENCES `mclass_subject` (`id`);

--
-- 限制表 `mclass_judgment`
--
ALTER TABLE `mclass_judgment`
  ADD CONSTRAINT `FK3ejer8anjf8l8c2e9qq4o1qj9` FOREIGN KEY (`judgment_id`) REFERENCES `mclass_subject` (`id`);

--
-- 限制表 `mclass_lesson`
--
ALTER TABLE `mclass_lesson`
  ADD CONSTRAINT `FKfay0v3u145ymqgfkfrlxki51` FOREIGN KEY (`check_in_id`) REFERENCES `mclass_check_in` (`id`);

--
-- 限制表 `mclass_mooc_class`
--
ALTER TABLE `mclass_mooc_class`
  ADD CONSTRAINT `FKhbruw69f379dlto1dmv62snsr` FOREIGN KEY (`course_id`) REFERENCES `mclass_course` (`id`);

--
-- 限制表 `mclass_option`
--
ALTER TABLE `mclass_option`
  ADD CONSTRAINT `FKdva24lm5bx7qpbwi3q86ddqm` FOREIGN KEY (`choice_id`) REFERENCES `mclass_choice` (`choice_id`);

--
-- 限制表 `mclass_subject`
--
ALTER TABLE `mclass_subject`
  ADD CONSTRAINT `FK3tpqqo88sfcesfjj5ddljfia2` FOREIGN KEY (`exercise_id`) REFERENCES `mclass_exercise` (`id`),
  ADD CONSTRAINT `FKihb1sa66psshqpf8j249n04p8` FOREIGN KEY (`examination_id`) REFERENCES `mclass_examination` (`id`);

--
-- 限制表 `upms_user_r_role`
--
ALTER TABLE `upms_user_r_role`
  ADD CONSTRAINT `FKi81xsuu0y51hmufc0r5dh5dwk` FOREIGN KEY (`user_id`) REFERENCES `upms_user` (`id`),
  ADD CONSTRAINT `FKjmjyy5bqjuh68rsqak8f3is7n` FOREIGN KEY (`role_id`) REFERENCES `upms_role` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
