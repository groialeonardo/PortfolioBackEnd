-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 01-05-2022 a las 13:59:22
-- Versión del servidor: 5.7.36
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `lgportfolio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `educacion`
--

DROP TABLE IF EXISTS `educacion`;
CREATE TABLE IF NOT EXISTS `educacion` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fin` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `inicio` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `institucion` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `pathlogo` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `titulo` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `educacion`
--

INSERT INTO `educacion` (`id`, `descripcion`, `fin`, `inicio`, `institucion`, `pathlogo`, `titulo`) VALUES
(53, 'Me recibí de Ingeniero Electrónico.', '2014-03-01', '2004-03-01', 'Universidad Nacional de Rosario', 'http://localhost:4200/assets/img/Logos/Experiencias/UNR.jpg', 'Ingeniero Electrónico'),
(54, 'Me recibí de la secundaria', '2003-03-01', '1999-03-01', 'Colegio del Sol', 'http://localhost:4200/assets/img/Logos/Educacion/Colegio del sol.PNG', 'Bachiller en Humanidades y Artes - Orientación Informatica');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experiencia`
--

DROP TABLE IF EXISTS `experiencia`;
CREATE TABLE IF NOT EXISTS `experiencia` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `empresa` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fin` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `inicio` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `pathlogo` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `puesto` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `experiencia`
--

INSERT INTO `experiencia` (`id`, `descripcion`, `empresa`, `fin`, `inicio`, `pathlogo`, `puesto`) VALUES
(1, 'Supervisor de Automatizacion Industrial, Calibracion de Instrumentos de Medicion', 'Paladini', 'Actual', '12-2015', '../../../../assets/img/Logos/Experiencias/Paladini.jpg', 'Supervisor de Automatización'),
(2, 'Forme parte del Procces Control Team como Plant Information Engineer', 'Axion Energy', '11-2015', '03-2012', '../../../../assets/img/Logos/Experiencias/AxionEnergy.jpg', 'Plant Information Engineer'),
(3, 'Realicé trabajos como Técnico de Metrología Eléctrica', 'Universidad Nacional de Rosario', '09-2011', '03-2010', '../../../../assets/img/Logos/Experiencias/UNR.jpg', 'Técnico de Metrología Eléctrica'),
(4, 'Técnico en Informática y Redes', 'Municipalidad de Rosario', '03-2005', '03-2004', '../../../../assets/img/Logos/Experiencias/MuniRosario.png', 'Técnico en Informática y Redes'),
(52, 'asdasd', '111111111111111111111111', '0033-03-31', '3333-02-01', 'asdasd', 'asdasd');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(63);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `skill`
--

DROP TABLE IF EXISTS `skill`;
CREATE TABLE IF NOT EXISTS `skill` (
  `id` bigint(20) NOT NULL,
  `image_height` int(11) NOT NULL,
  `image_src` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `image_width` int(11) NOT NULL,
  `percent` int(11) NOT NULL,
  `radius` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `skill`
--

INSERT INTO `skill` (`id`, `image_height`, `image_src`, `image_width`, `percent`, `radius`) VALUES
(11, 75, '../assets/img/Logos/Skills/html5w.png', 50, 78, 80),
(12, 75, '../assets/img/Logos/Skills/cssw.png', 50, 83, 80),
(13, 75, '../assets/img/Logos/Skills/JSw.png', 50, 68, 80),
(14, 70, '../assets/img/Logos/Skills/angularw.png', 65, 66, 80),
(15, 75, '../assets/img/Logos/Skills/white_git.png', 75, 60, 80),
(16, 80, '../assets/img/Logos/Skills/logo-java.png', 45, 55, 80),
(17, 23, '../assets/img/Logos/Skills/Jquery.png', 100, 31, 80),
(18, 40, '../assets/img/Logos/Skills/MySQL.png', 80, 49, 80);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
