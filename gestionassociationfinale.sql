-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Ven 26 Décembre 2014 à 15:24
-- Version du serveur: 5.6.12-log
-- Version de PHP: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `gestionassociationfinale`
--
CREATE DATABASE IF NOT EXISTS `gestionassociationfinale` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `gestionassociationfinale`;

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

CREATE TABLE IF NOT EXISTS `administrateur` (
  `idAdministrateur` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `date_naissance` varchar(255) DEFAULT NULL,
  `mdp` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idAdministrateur`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=18 ;

--
-- Contenu de la table `administrateur`
--

INSERT INTO `administrateur` (`idAdministrateur`, `nom`, `prenom`, `mail`, `date_naissance`, `mdp`, `login`) VALUES
(11, 'bbbbbbb', 'rgregreg', 'erferf@fre.gt', '4/5/6', 'regergerg', 'badisrger'),
(14, 'tttttttt', 'tttttttttttt', 'ttrtrt@tr.gt', '1/2/6', 'ergerger', 'badisjregr'),
(16, 'mmmmmmmm', 'mmmmmmm', 'mmmm@hh.fr', '5/6/6', 'jn kjvre', 'badisbnj'),
(17, 'jiji', 'jiji', 'jiji@hh.hh', '7/5/6', 'jbkjbkjb', 'badisjn');

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

CREATE TABLE IF NOT EXISTS `categorie` (
  `idCategorie` int(11) NOT NULL AUTO_INCREMENT,
  `nomCategorie` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idCategorie`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Contenu de la table `categorie`
--

INSERT INTO `categorie` (`idCategorie`, `nomCategorie`, `description`) VALUES
(1, 'vvvvvvvdd', 'dvsdvzegzrvsdvzegzegze'),
(5, 'aaaaa', 'aaaaaaaaa'),
(6, 'eeeeeee', 'eeeeeeee');

-- --------------------------------------------------------

--
-- Structure de la table `chef_de_groupe`
--

CREATE TABLE IF NOT EXISTS `chef_de_groupe` (
  `idChef` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `date_naissance` varchar(255) DEFAULT NULL,
  `mdp` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `sexe` varchar(255) DEFAULT NULL,
  `rue` varchar(255) NOT NULL,
  `numero` int(11) NOT NULL,
  `codePostal` int(11) NOT NULL,
  PRIMARY KEY (`idChef`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Contenu de la table `chef_de_groupe`
--

INSERT INTO `chef_de_groupe` (`idChef`, `nom`, `prenom`, `age`, `mail`, `date_naissance`, `mdp`, `login`, `sexe`, `rue`, `numero`, `codePostal`) VALUES
(5, 'badis', 'hasni', 15, 'jjjj@hfr.gt', '7/5/3', 'zrfzrfzrf', 'badisze', NULL, 'trgtreg', 145, 8638);

-- --------------------------------------------------------

--
-- Structure de la table `membre`
--

CREATE TABLE IF NOT EXISTS `membre` (
  `idMembre` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `date_naissance` varchar(255) DEFAULT NULL,
  `mdp` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `sexe` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idMembre`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `membre`
--

INSERT INTO `membre` (`idMembre`, `nom`, `prenom`, `age`, `mail`, `date_naissance`, `mdp`, `login`, `sexe`) VALUES
(1, 'jkkkkkkkkkk', 'kkkkkkkk', 66, 'kkkk@hhh.hy', '7/5/6', 'jnsvjdfjv', 'badisjnjn', NULL),
(3, 'rrrrrrrrrrr', 'rrrrrrrrr', 45, 'neg@fr.gt', '4/5/3', 'zffzefz', 'badisded', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `mission`
--

CREATE TABLE IF NOT EXISTS `mission` (
  `idMission` int(11) NOT NULL AUTO_INCREMENT,
  `nomMission` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `lieuMission` varchar(255) DEFAULT NULL,
  `dateMission` varchar(255) DEFAULT NULL,
  `budget` varchar(255) DEFAULT NULL,
  `idAdministrateur` int(11) DEFAULT NULL,
  `idChef` int(11) DEFAULT NULL,
  PRIMARY KEY (`idMission`),
  KEY `FK3FBE818C34A2C037` (`idChef`),
  KEY `FK3FBE818C66E5A8B6` (`idAdministrateur`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=18 ;

--
-- Contenu de la table `mission`
--

INSERT INTO `mission` (`idMission`, `nomMission`, `description`, `lieuMission`, `dateMission`, `budget`, `idAdministrateur`, `idChef`) VALUES
(13, 'cccccccc', 'cccccccccccccccccccccccccc', 'cccccccccc', '1/5/6', '152', 11, 5),
(17, 'aaaa', 'aaaaaaaaaaaa', 'aaaaaaaa', '4/5/6', '146', 16, 5);

-- --------------------------------------------------------

--
-- Structure de la table `mission_categorie`
--

CREATE TABLE IF NOT EXISTS `mission_categorie` (
  `idMission` int(11) NOT NULL,
  `idCategorie` int(11) NOT NULL,
  PRIMARY KEY (`idMission`,`idCategorie`),
  KEY `FKD9F8DE44A901C228` (`idCategorie`),
  KEY `FKD9F8DE444565A952` (`idMission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `mission_categorie`
--

INSERT INTO `mission_categorie` (`idMission`, `idCategorie`) VALUES
(13, 5),
(13, 6);

-- --------------------------------------------------------

--
-- Structure de la table `mission_membre`
--

CREATE TABLE IF NOT EXISTS `mission_membre` (
  `idMission` int(11) NOT NULL,
  `idMembre` int(11) NOT NULL,
  `durree` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idMission`,`idMembre`),
  KEY `FKD6757233AF31C2C6` (`idMembre`),
  KEY `FKD67572334565A952` (`idMission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `mission_membre`
--

INSERT INTO `mission_membre` (`idMission`, `idMembre`, `durree`) VALUES
(13, 1, 'hhhhhh'),
(17, 3, 'huits jours');

-- --------------------------------------------------------

--
-- Structure de la table `rapport`
--

CREATE TABLE IF NOT EXISTS `rapport` (
  `idRapport` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `lieu_mission` varchar(255) DEFAULT NULL,
  `date_mission` varchar(255) DEFAULT NULL,
  `duree_mission` varchar(255) DEFAULT NULL,
  `budget_totale` int(11) DEFAULT NULL,
  `budget_hebergement` int(11) DEFAULT NULL,
  `budget_nourriture` int(11) DEFAULT NULL,
  `budget_transport` int(11) DEFAULT NULL,
  `dons` int(11) DEFAULT NULL,
  `autre_depence` int(11) DEFAULT NULL,
  `idMission` int(11) DEFAULT NULL,
  PRIMARY KEY (`idRapport`),
  UNIQUE KEY `idMission` (`idMission`),
  KEY `FK3A6B58224565A952` (`idMission`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

--
-- Contenu de la table `rapport`
--

INSERT INTO `rapport` (`idRapport`, `description`, `lieu_mission`, `date_mission`, `duree_mission`, `budget_totale`, `budget_hebergement`, `budget_nourriture`, `budget_transport`, `dons`, `autre_depence`, `idMission`) VALUES
(8, 'hhhhhhhhh', 'hhh', '7/5/6', '5h', 777, 777, 777, 777, 88, 777, 13);

-- --------------------------------------------------------

--
-- Structure de la table `rapportinteradmin`
--

CREATE TABLE IF NOT EXISTS `rapportinteradmin` (
  `idRapportInterAdmin` int(11) NOT NULL,
  `remarqueAdm` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idRapportInterAdmin`),
  KEY `FKD4C38975351BB9B1` (`idRapportInterAdmin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `rapportinteradmin`
--

INSERT INTO `rapportinteradmin` (`idRapportInterAdmin`, `remarqueAdm`) VALUES
(8, 'revreverv');

-- --------------------------------------------------------

--
-- Structure de la table `rapportjustifier`
--

CREATE TABLE IF NOT EXISTS `rapportjustifier` (
  `idRapportJustifier` int(11) NOT NULL,
  `justifier` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idRapportJustifier`),
  KEY `FKB164E94B2AABEC3D` (`idRapportJustifier`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `mission`
--
ALTER TABLE `mission`
  ADD CONSTRAINT `FK3FBE818C34A2C037` FOREIGN KEY (`idChef`) REFERENCES `chef_de_groupe` (`idChef`),
  ADD CONSTRAINT `FK3FBE818C66E5A8B6` FOREIGN KEY (`idAdministrateur`) REFERENCES `administrateur` (`idAdministrateur`);

--
-- Contraintes pour la table `mission_categorie`
--
ALTER TABLE `mission_categorie`
  ADD CONSTRAINT `FKD9F8DE444565A952` FOREIGN KEY (`idMission`) REFERENCES `mission` (`idMission`),
  ADD CONSTRAINT `FKD9F8DE44A901C228` FOREIGN KEY (`idCategorie`) REFERENCES `categorie` (`idCategorie`);

--
-- Contraintes pour la table `mission_membre`
--
ALTER TABLE `mission_membre`
  ADD CONSTRAINT `FKD67572334565A952` FOREIGN KEY (`idMission`) REFERENCES `mission` (`idMission`),
  ADD CONSTRAINT `FKD6757233AF31C2C6` FOREIGN KEY (`idMembre`) REFERENCES `membre` (`idMembre`);

--
-- Contraintes pour la table `rapport`
--
ALTER TABLE `rapport`
  ADD CONSTRAINT `FK3A6B58224565A952` FOREIGN KEY (`idMission`) REFERENCES `mission` (`idMission`);

--
-- Contraintes pour la table `rapportinteradmin`
--
ALTER TABLE `rapportinteradmin`
  ADD CONSTRAINT `FKD4C38975351BB9B1` FOREIGN KEY (`idRapportInterAdmin`) REFERENCES `rapport` (`idRapport`);

--
-- Contraintes pour la table `rapportjustifier`
--
ALTER TABLE `rapportjustifier`
  ADD CONSTRAINT `FKB164E94B2AABEC3D` FOREIGN KEY (`idRapportJustifier`) REFERENCES `rapport` (`idRapport`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
