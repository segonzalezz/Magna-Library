-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-10-2023 a las 17:12:45
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `magna`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id_categoria` varchar(50) NOT NULL,
  `nom_categoria` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id_categoria`, `nom_categoria`) VALUES
('288', 'Ficcion'),
('193', 'Historia'),
('102', 'Romance'),
('459', 'Terror');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

CREATE TABLE `libro` (
  `id_libro` varchar(50) NOT NULL,
  `tit_libro` varchar(50) NOT NULL,
  `aut_libro` varchar(50) NOT NULL,
  `ano_public` varchar(50) NOT NULL,
  `can_stock` smallint(6) NOT NULL,
  `cod_categoria` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`id_libro`, `tit_libro`, `aut_libro`, `ano_public`, `can_stock`, `cod_categoria`) VALUES
('000', 'El Exorcista', 'William Peter Blatty', '2023-10-13', 66, '459'),
('009', 'Posdata: Te amo', 'Cecelia Ahern', '2017-10-12', 65, '102'),
('035', 'El silencio de los corderos', 'Thomas Harris', '2023-10-12', 47, '459'),
('074', 'The Wright Brothers', 'David McCullough', '2000-10-12', 56, '193'),
('111', 'Principito', 'Antoine de Saint', '1999-10-04', 27, '193'),
('123', '1984', 'George Orwell', '1998-10-06', -3, '288'),
('125', 'Don Quijote de la Mancha', 'Miguel de Cervantes', '1789-10-17', 53, '288'),
('129', 'Los juegos del hambre', 'Suzanne Collins', '2023-10-13', 56, '288'),
('144', 'Cien años de soledad', 'Gabriel García Márquez', '2006-10-05', 40, '288'),
('253', 'Matar a un ruiseñor', 'Harper Lee', '2003-10-25', 26, '288'),
('268', 'Un beso en París', 'Stephanie Perkins', '2023-10-05', 65, '102'),
('274', 'Me Before You', 'Jojo Moyes', '2000-10-13', 60, '102'),
('283', 'De animales a dioses', 'Yuval Noah Harari', '2000-10-14', 59, '193'),
('292', 'Los mitos de la historia argentina', 'Felipe Pigna', '2023-10-13', 83, '193'),
('294', 'El nombre del viento', 'Patrick Rothfuss', '2023-10-21', 63, '288'),
('295', 'Un pueblo traicionado', 'Hugh Thomas', '2004-10-21', 83, '193'),
('297', 'Yo antes de ti', 'Jojo Moyes', '2023-10-05', 74, '102'),
('298', 'En busca del tiempo perdido', ' Marcel Proust', '2008-10-18', 60, '288'),
('333', 'El Holocausto', 'Martin Gilbert', '2001-10-12', 68, '193'),
('346', 'El Gran Gatsby', 'F. Scott Fitzgerald', '2023-10-05', 60, '288'),
('423', 'Orgullo y prejuicio', 'Jane Austen', '2023-10-21', 50, '102'),
('556', 'Outlander', 'Diana Gabaldon', '2009-10-08', 35, '102'),
('567', 'El juego de Gerald', 'Stephen King', '2023-10-19', 55, '459'),
('625', 'Stalingrado', 'Antony Beevor', '2023-10-05', 50, '193'),
('638', 'It', 'Stephen King', '2023-10-12', 57, '459'),
('642', 'Crónica de una muerte anunciada', 'Gabriel García Márquez', '2023-10-12', 72, '288'),
('643', 'La chica del tren', 'Paula Hawkins', '2023-10-12', 49, '102'),
('648', 'Las Américas antes de Colón', ' Charles C. Mann', '2017-10-13', 40, '193'),
('666', 'El diario de Ana Frank', 'Anne Frank', '2023-10-12', 50, '193'),
('675', 'La carretera', 'Oscar Wilde', '2023-10-19', 75, '459'),
('733', 'Breve historia del tiempo\"', 'Stephen Hawking', '2007-06-13', 42, '193'),
('734', 'Drácula', 'Bram Stoker', '2000-10-21', 50, '459'),
('754', 'El visitante', 'Stephen King', '2023-10-12', 74, '459'),
('776', 'El horror de Dunwich', 'H.P. Lovecraft', '2023-10-19', 65, '459'),
('820', 'Bajo el sol de medianoche', 'Stephenie Meyer', '2006-10-05', 56, '102'),
('832', 'La sombra del viento', 'Carlos Ruiz Zafón', '2023-10-13', 83, '288'),
('833', 'El resplandor', 'Stephen King', '2023-10-13', 67, '459'),
('834', 'El arte de la guerra', 'Rodrigo Guerrero', '2023-10-20', 53, '193'),
('845', 'El retrato de Dorian Gray', 'Oscar Wilde', '2023-10-05', 48, '459'),
('876', 'El cuaderno de Noah', 'Nicholas Sparks', '2023-10-05', 69, '102'),
('888', 'Coraline', 'Neil Gaiman', '2023-10-12', 53, '459'),
('938', 'El amor en los tiempos del cólera', 'Gabriel García Márquez', '2005-10-14', 46, '102'),
('974', 'Historia del mundo en 100 objetos', 'Neil MacGregor', '2023-10-09', 95, '193');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo`
--

CREATE TABLE `prestamo` (
  `id_prestamo` varchar(50) NOT NULL,
  `dateS_prestamo` varchar(50) NOT NULL,
  `dateF_prestamo` varchar(50) NOT NULL,
  `cod_user` varchar(50) DEFAULT NULL,
  `cod_libro` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `prestamo`
--

INSERT INTO `prestamo` (`id_prestamo`, `dateS_prestamo`, `dateF_prestamo`, `cod_user`, `cod_libro`) VALUES
('123', '2023-10-06', '2023-10-06', '122', '123'),
('134', '2023-10-07', '2023-10-08', '122', '123'),
('144', '2023-10-07', '2023-10-08', '122', '123'),
('1555', '2023-10-07', '2023-10-09', '122', '123'),
('166', '2023-10-07', '2023-10-08', '122', '123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `id_rol` varchar(50) NOT NULL,
  `nom_rol` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`id_rol`, `nom_rol`) VALUES
('167', 'Administrador'),
('254', 'Bibliotecario'),
('234', 'Profesor');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `nom_persona` varchar(50) NOT NULL,
  `ed_persona` smallint(6) NOT NULL,
  `ced_persona` varchar(50) NOT NULL,
  `dir_persona` varchar(50) NOT NULL,
  `user_u` varchar(50) NOT NULL,
  `pass_u` varchar(50) NOT NULL,
  `cod_rol` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`nom_persona`, `ed_persona`, `ced_persona`, `dir_persona`, `user_u`, `pass_u`, `cod_rol`) VALUES
('Nicolas', 25, '1006432553', 'San Felipe', '111', '111', '234'),
('Santiago', 21, '1006432558', 'San Juan ', '123', '123', '167'),
('Felipe', 28, '100643556', 'Juan Tierra', '122', '122', '254');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`),
  ADD UNIQUE KEY `nom_categoria` (`nom_categoria`);

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`id_libro`),
  ADD UNIQUE KEY `tit_libro` (`tit_libro`),
  ADD KEY `cod_categoria` (`cod_categoria`);

--
-- Indices de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD PRIMARY KEY (`id_prestamo`),
  ADD KEY `cod_user` (`cod_user`),
  ADD KEY `cod_libro` (`cod_libro`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id_rol`),
  ADD UNIQUE KEY `nom_rol` (`nom_rol`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ced_persona`),
  ADD UNIQUE KEY `user_u` (`user_u`),
  ADD KEY `cod_rol` (`cod_rol`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `libro`
--
ALTER TABLE `libro`
  ADD CONSTRAINT `libro_ibfk_1` FOREIGN KEY (`cod_categoria`) REFERENCES `categoria` (`id_categoria`);

--
-- Filtros para la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD CONSTRAINT `prestamo_ibfk_1` FOREIGN KEY (`cod_user`) REFERENCES `usuario` (`user_u`),
  ADD CONSTRAINT `prestamo_ibfk_2` FOREIGN KEY (`cod_libro`) REFERENCES `libro` (`id_libro`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`cod_rol`) REFERENCES `rol` (`id_rol`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
