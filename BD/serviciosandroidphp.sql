-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-01-2017 a las 12:43:04
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `serviciosandroidphp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `codAlu` char(5) NOT NULL,
  `nombreAlu` varchar(30) DEFAULT NULL,
  `Distrito` varchar(50) DEFAULT NULL,
  `EstadoCivil` varchar(30) DEFAULT NULL,
  `pasUsu` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 PACK_KEYS=0;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`codAlu`, `nombreAlu`, `Distrito`, `EstadoCivil`, `pasUsu`) VALUES
('A1', 'Eulises', 'Lomas de Zamora', 'Casado', 'euli3755');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`codAlu`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
