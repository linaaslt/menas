-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 2020 m. Bir 19 d. 09:05
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `meno_kampelis`
--

-- --------------------------------------------------------

--
-- Sukurta duomenų struktūra lentelei `menininkai`
--

CREATE TABLE `menininkai` (
  `id` int(11) NOT NULL,
  `Vardas` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Pavardė` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Gimimo metai` date NOT NULL,
  `Tautybė` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Sukurta duomenų kopija lentelei `menininkai`
--

INSERT INTO `menininkai` (`id`, `Vardas`, `Pavardė`, `Gimimo metai`, `Tautybė`) VALUES
(1, 'Agnė', 'Mikalauskienė', '1975-02-15', 'Lietuvė'),
(2, 'Kristie', 'Enko', '1992-03-12', 'Lietuvė'),
(3, 'Marus', 'Zadavskis', '1978-07-09', 'Lietuvis');

-- --------------------------------------------------------

--
-- Sukurta duomenų struktūra lentelei `muziejai`
--

CREATE TABLE `muziejai` (
  `id` int(11) NOT NULL,
  `Pavadinimas` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Valstybė` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Meno kryptis` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Miestas` varchar(64) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Sukurta duomenų kopija lentelei `muziejai`
--

INSERT INTO `muziejai` (`id`, `Pavadinimas`, `Valstybė`, `Meno kryptis`, `Miestas`) VALUES
(1, 'Nacionalinis M. K. Čiurlionio dailės muziejus', 'Lietuva', 'Įvairi', 'Kaunas'),
(2, 'Vytauto Didžiojo karo muziejus', 'Lietuva', 'Įvairi', 'Kaunas'),
(3, 'Kauno miesto muziejus', 'Lietuva', 'Įvairi', 'Kaunas'),
(4, 'Perkūno namas', 'Lietuva', 'Įvairi', 'Kaunas');

-- --------------------------------------------------------

--
-- Sukurta duomenų struktūra lentelei `paveikslai`
--

CREATE TABLE `paveikslai` (
  `id` int(11) NOT NULL,
  `Pavadinimas` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `Kūrėjas` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `Stilius` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `Sukurtas metais` int(4) NOT NULL,
  `Kaina` int(11) NOT NULL,
  `id_menininkai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Sukurta duomenų kopija lentelei `paveikslai`
--

INSERT INTO `paveikslai` (`id`, `Pavadinimas`, `Kūrėjas`, `Stilius`, `Sukurtas metais`, `Kaina`, `id_menininkai`) VALUES
(1, 'Banginis tarp uodegos formos augalų', 'Kristie Enko', 'Tušinukas', 2020, 19, 2),
(2, 'Popietė parke', 'Agnė Mikalauskienė', 'Aliejus', 2019, 177, 1),
(3, 'Malūnas', 'Agnė Mikalauskienė', 'Aliejus', 2019, 339, 1);

-- --------------------------------------------------------

--
-- Sukurta duomenų struktūra lentelei `skulptūros`
--

CREATE TABLE `skulptūros` (
  `id` int(11) NOT NULL,
  `Pavadinimas` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `Kūrėjas` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `Sukurtas metais` int(4) NOT NULL,
  `Stilius` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `Kaina` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Sukurta duomenų kopija lentelei `skulptūros`
--

INSERT INTO `skulptūros` (`id`, `Pavadinimas`, `Kūrėjas`, `Sukurtas metais`, `Stilius`, `Kaina`) VALUES
(1, 'Apolonas', 'Marius Zavadskis', 2018, 'Granitas', 4000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `menininkai`
--
ALTER TABLE `menininkai`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `muziejai`
--
ALTER TABLE `muziejai`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `paveikslai`
--
ALTER TABLE `paveikslai`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `skulptūros`
--
ALTER TABLE `skulptūros`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `menininkai`
--
ALTER TABLE `menininkai`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `muziejai`
--
ALTER TABLE `muziejai`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `paveikslai`
--
ALTER TABLE `paveikslai`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `skulptūros`
--
ALTER TABLE `skulptūros`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
