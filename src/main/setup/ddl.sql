CREATE DATABASE `test` /*!40100 DEFAULT CHARACTER SET latin1 */;

CREATE TABLE `chamados` (
  `processo` varchar(20) NOT NULL,
  `jira` varchar(10) NOT NULL,
  `chamadoInterno` varchar(10) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`processo`),
  UNIQUE KEY `jira_UNIQUE` (`jira`),
  UNIQUE KEY `chamadoInterno_UNIQUE` (`chamadoInterno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SELECT * FROM test.chamados;
