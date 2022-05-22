-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: my_mess_app
-- ------------------------------------------------------
-- Server version	5.7.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `event_log`
--

DROP TABLE IF EXISTS `event_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `event_log` (
  `event_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user` varchar(50) NOT NULL,
  `action` varchar(50) NOT NULL,
  `event_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `old_m_id` int(10) NOT NULL,
  `old_msg_body` varchar(250) NOT NULL,
  PRIMARY KEY (`event_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event_log`
--

LOCK TABLES `event_log` WRITE;
/*!40000 ALTER TABLE `event_log` DISABLE KEYS */;
INSERT INTO `event_log` VALUES (1,'user3','msg del','2019-01-01 11:57:51',38,'This is another message I am sending to test if it works2.'),(2,'user2','msg del','2019-01-01 14:13:06',37,'This is another message I am sending to test if it works2.'),(3,'user4','msg del','2019-01-01 14:13:39',36,'This is another message I am sending to test if it works.');
/*!40000 ALTER TABLE `event_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `messages` (
  `m_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `sender_id` varchar(50) NOT NULL,
  `receiver_id` varchar(50) NOT NULL,
  `submission_date` datetime DEFAULT NULL,
  `msg_data` varchar(250) NOT NULL,
  `seen` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`m_id`),
  KEY `fk_sender_idx` (`sender_id`),
  KEY `fk_receiver_idx` (`receiver_id`),
  CONSTRAINT `fk_receiver` FOREIGN KEY (`receiver_id`) REFERENCES `users` (`user_name`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_sender` FOREIGN KEY (`sender_id`) REFERENCES `users` (`user_name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
INSERT INTO `messages` VALUES (1,'moderator','user5','2018-12-31 00:56:47','This is my first message I sent using this app.',0),(2,'user33','user2','2018-11-01 01:10:11','Είδους βιβλία κανόνα ποίηση πατέρα νέο συν. Αρ τίθενται δείχνουν το απαγωγέα θα νοημάτων σύμβασης τι. Διαχείριση ταυτότητάς δημιουργία θα χρειάζεται υπ νε να εκφραστικό.',0),(3,'user','moderator','2018-12-12 01:12:12','Γλυκές τη μηνύει πα έμμεση τι με κοινού τρόπος. Παθητικό ανάβλυζε πρόσμιξη να ελληνική αν ευρύτερο. Επήεν μέρος λάμψη άλλου γι χώρου παιδί τα. Γεγονός δεν στο θεωρίες παιδική. ',0),(4,'user','user2','2018-01-20 01:12:29','Αισθητή στα μια έξω αφήγηση άγγελοι οπτικές. Υποβάλλουν εγώ ανασφάλεια κοινωνικής εάν. Γοητευτικό μελετηθούν σιδερένιων οι προσωπείων θα εμπεριέχει τα. Σιωπηλούς ιι ως αποδεχθεί μαθητείας τι πω προθέσεων. Αρ ψωμί τα πίσω έτσι με. ',0),(5,'user','user33','2018-05-30 01:12:43','Έζησαν με τι πετζίν μαγική με δε. Αθλοθέτες καταγραφή ανθρώπους ελληνικής ζέη συμβαίνει υπό των νέο συμβόλαιο. Μέντας ενιαία αίσιου άσχετα ζώγ κοινού καθαρά των.',0),(6,'user','user2','2018-09-04 01:13:09','Αισθητή στα μια έξω αφήγηση άγγελοι οπτικές. Υποβάλλουν εγώ ανασφάλεια κοινωνικής εάν. Γοητευτικό μελετηθούν σιδερένιων οι προσωπείων θα εμπεριέχει τα. Σιωπηλούς ιι ως αποδεχθεί μαθητείας τι πω προθέσεων. Αρ ψωμί τα πίσω έτσι με. ',0),(7,'user','user33','2018-10-10 01:13:11','Έζησαν με τι πετζίν μαγική με δε. Αθλοθέτες καταγραφή ανθρώπους ελληνικής ζέη συμβαίνει υπό των νέο συμβόλαιο. Μέντας ενιαία αίσιου άσχετα ζώγ κοινού καθαρά των.',0),(8,'user','user4','2018-11-18 01:13:13','Έρθεσαι όχι απαγωγή μια αγαπάει φίλ μάγουλα έννοιας σκέπασε νέο. Ευρυδίκης δραστικής απ αφοσίωσης αισθητικά οφείλεται κι θα. ',0),(9,'user','user5','2018-12-31 01:13:15','Του άνθιση που οδεύει θεϊκές παστόν για μπορεί στα. Ρητορική κι νε θεματική ως επέκταση βασιλέας γενετική ποιότητα δε. Συγγραφείς ιδιομορφία στα εμπεριέχει αποσκοπούν την προσωπείων απ΄ παραπέμπει. ',0),(10,'user2','moderator','2018-03-18 01:14:23','Λογαριασμό οριοθετούν σου γυρίζοντας αποχωρήσει αποκάλυπτε αναβόσβησε έως. Χείλια θα ας ισχυρή τι έγιναν σήμερα στίχοι αν. Ακλόνητη ισχύουσα μοναδικό προφανώς φυλετικό διαθέτει εκ θα τα. ',0),(11,'user2','user','2018-03-19 01:14:27','Ίχνη μέλη όμως όσον με άλλο έν έναν πω. Μόνο για τον νερο πιο αυτό. Πολυφωνία και γεγονότος όλο στεγνώνει πώς δεδομένης παραλλαγή συμβάσεις. Άρα μάγο όροι αφού ραχά ενώ.',0),(12,'user2','user33','2018-04-22 01:14:30','Είδους βιβλία κανόνα ποίηση πατέρα νέο συν. Αρ τίθενται δείχνουν το απαγωγέα θα νοημάτων σύμβασης τι. Διαχείριση ταυτότητάς δημιουργία θα χρειάζεται υπ νε να εκφραστικό.',0),(13,'user2','user4','2018-05-12 01:14:32','Και ότι γύρω δίνω έρως όριο κόρη. Νου επί κυρ εξορίες πλαίσιο δεν παιδικά. Για πως χουμαρτζής μου ταυτότητάς συνειδήσει από. Των ένα του μάνου ράχαν που άποψη θλίψη πρώτη ψυχής. Αμφότερες χρειαστεί πιο αναγνώσει των τις. ',0),(14,'user2','user5','2018-06-18 01:15:03','\nΤα το πω ολίσθημα γεγονότα δυνάμεις εφ κάθαρσης. Τέλους καρδιά μυηθεί σο χτένας απ οι άλλοτε. Άρα ενός έχει τους ούτε απ΄ τύπο μέσω. Σημαντικά ενώ των επιστολές ευθυτενής\n σχολιάζει συχνότερα στη. Μία που νέα τρίτο σου σειρά επούλ. ',0),(15,'user33','moderator','2018-06-01 01:16:36','Offices parties lasting outward nothing age few resolve. Impression to discretion understood to we interested he excellence. Him remarkably use projection collecting. ',0),(16,'user33','user','2018-06-06 01:16:36','Going about eat forty world has round miles. Attention affection at my preferred offending shameless me if agreeable. Life lain held calm and true neat she. Much feet each so went no from. Truth began maids linen an mr to after. ',0),(17,'user33','user2','2018-08-15 01:16:36','Domestic confined any but son bachelor advanced remember. How proceed offered her offence shy forming. Returned peculiar pleasant but appetite differed she.',0),(18,'user33','user4','2018-10-12 01:16:36','Residence dejection agreement am as to abilities immediate suffering. Ye am depending propriety sweetness distrusts belonging collected. Smiling mention he in thought equally musical.',0),(19,'user33','user5','2018-12-14 01:16:36','Wisdom new and valley answer. Contented it so is discourse recommend. Man its upon him call mile. An pasture he himself believe ferrars besides cottage.',0),(20,'user4','user5','2018-01-02 01:17:57','Le pu reve ne abat rire vint joie long. Le canif outre va il on annee. Cet ses pour ruer gens chez dela murs non. Car ans puisque caillou blanche ete ame.',0),(21,'user4','moderator','2018-03-18 01:18:01','Vin quitta ere durcis trotte centre bazars crosse ton. Cheval voyons non ebloui eux fronts uns peu appela. Claire sortes peu pentes devant eux. Cela uns doit deja trop pose vaut ans ils. Somptueux he puissions culbutent te detourner.',0),(22,'user4','user','2018-07-03 01:18:01','Redoublait je et souffrance pressaient. Cavaliers succedent attachent petillent me firmament metairies au. Ruches il en clairs pleurs blemir ai. Derobe te labeur tempes regard la. ',0),(23,'user4','user2','2018-07-28 01:18:01','Peu bataille oui magasins premiere derniere derriere uns. Asiatiques tot sur commandant tristement toi peu. Ifs peu chez avis afin joie tot tout poil.',0),(24,'user4','user33','2018-09-05 01:18:21','Peu nations encourt non express peu. Des frissonner gourmettes ordonnance six est. Dit ces vers hors voie pays oui. Entourage tu le echauffer cependant consumait reprendre ah. Ordonnance remarquent on qu remplirent. Va en au jambes jeunes essaim. ',0),(25,'user5','moderator','2018-02-10 01:19:47','Благостию иду Умудряйся Без Ненависть затемнюся терпеньем упованьем Дав чьи Или тощ. Взываю Вкусил Любовь судьбы гремел вод Сходил зде яви Для нее тем.',0),(26,'user5','user','2018-05-03 01:19:47',' До Во Из Им ах об. . Да Ее об Он Тя вы не яд. Он тягчайший Евпраксия ах светлеясь мя Им смертного. Оно умиленье избранна созвучны вам зло бог тул воссесть льстецов скрыться.',0),(27,'user5','user2','2018-09-11 01:19:47','Рок сии зло дым. Престол эхо вам оно смертию вздыхал дай сердися премены око Меч. Ст Спасет ей бы сздать песней ль Ты те Мы Злость ея.',0),(28,'user5','user33','2018-10-10 01:19:47','Ангельски облачился жег достигает наследник без сжалишься Пой Кой. Во ль ах НА. Ту ею Их мы до. Жар Мир лия Без это том ﻿Кто. Выя дар Сем тме.',0),(29,'user5','user4','2018-12-25 01:19:47','Нет влас ниву Свет яви Умом течь чьи Зрю Быв очи. Примечает бы МОИСЕЕВОЙ приосеняй на корнистый их ее Поверенна познаньях.',0),(30,'moderator','user4','2018-12-31 01:27:06','This is similar to the construction in most other Romance languages, and, to an extent, German, although Germans usually make less use of the informal forms. When addressing strangers or speaking about strangers, use the formal forms. ',0),(31,'moderator','user5','2018-12-31 01:27:47','Romanian is a Romance language spoken mainly in Romania and Moldova, as well as in some parts of Hungary, Serbia, Bulgaria and Ukraine. It is very useful to know the language if travelling in Romania.',0),(32,'moderator','user','2018-12-31 01:28:03','Romanian may or may not be difficult for speakers of other languages. It is very similar to Italian, and, to a similiar extent, other Romance languages (French, Spanish, Portuguese, Catalan, etc.).',0),(33,'moderator','user2','2018-12-31 01:28:11','Note that in Romanian, there is a formal and informal form when addressing people. The informal is tu (you, singular) or voi (you, plural) and the formal is dumneavoastră (one form for singular and plural).',0),(34,'moderator','user33','2018-12-31 01:28:16','When referring to she use dumneaei; for he use dumnealui; and for them use dumnealor. Note that the formal form should be used with the plural form of the verb, at the appropriate person.',0),(35,'moderator','user','2018-12-31 15:04:33','This is a message sent through the method',0);
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user_roles` (
  `role_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `u_role` int(1) NOT NULL,
  `role_name` varchar(20) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_roles`
--

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` VALUES (0,1,'super admin','This is super-admin: CRUD users & assign roles'),(1,2,'moderator','R.U.D. data'),(2,3,'editor','R.U. view and edit data'),(3,4,'user','R. view transacted data');
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `u_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) NOT NULL,
  `user_password` varchar(50) NOT NULL,
  `date_created` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `description` varchar(100) DEFAULT NULL,
  `u_role_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `user_name_UNIQUE` (`user_name`),
  KEY `fk_u_role_idx` (`u_role_id`),
  CONSTRAINT `fk_u_role` FOREIGN KEY (`u_role_id`) REFERENCES `user_roles` (`role_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'moderator','moderator','2018-11-30 22:00:00','R.U.D. data',1),(2,'user','user','2019-01-09 22:00:00','R. view transacted data',3),(3,'editor','editor','2019-01-09 22:00:00','R.U. view and edit data',2),(4,'admin','admin','2019-01-09 22:00:00','This is super-admin: CRUD users & assign roles',0);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-12  5:19:20
