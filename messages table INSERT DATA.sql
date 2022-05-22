SELECT * FROM my_mess_app.messages;




# CRUD
#SEND MESSAGE
INSERT INTO messages(sender_id, receiver_id, submission_date,msg_data)
VALUES("admin","user1",NOW(),"This is my first message I sent using this app.");

INSERT INTO messages(sender_id, receiver_id, submission_date,msg_data)
VALUES("user3","user2",NOW(),"Είδους βιβλία κανόνα ποίηση πατέρα νέο συν. Αρ τίθενται δείχνουν το απαγωγέα θα νοημάτων σύμβασης τι. Διαχείριση ταυτότητάς δημιουργία θα χρειάζεται υπ νε να εκφραστικό.");


INSERT INTO messages(sender_id, receiver_id, submission_date,msg_data)
VALUES("admin","user5",NOW(),"Romanian is a Romance language spoken mainly in Romania and Moldova, as well as in some parts of Hungary, Serbia, Bulgaria and Ukraine. It is very useful to know the language if travelling in Romania.");
INSERT INTO messages(sender_id, receiver_id, submission_date,msg_data)
VALUES("admin","user1",NOW(),"Romanian may or may not be difficult for speakers of other languages. It is very similar to Italian, and, to a similiar extent, other Romance languages (French, Spanish, Portuguese, Catalan, etc.).");
INSERT INTO messages(sender_id, receiver_id, submission_date,msg_data)
VALUES("admin","user2",NOW(),"Note that in Romanian, there is a formal and informal form when addressing people. The informal is tu (you, singular) or voi (you, plural) and the formal is dumneavoastră (one form for singular and plural).");
INSERT INTO messages(sender_id, receiver_id, submission_date,msg_data)
VALUES("admin","user3",NOW(),"When referring to she use dumneaei; for he use dumnealui; and for them use dumnealor. Note that the formal form should be used with the plural form of the verb, at the appropriate person.");
INSERT INTO messages(sender_id, receiver_id, submission_date,msg_data)
VALUES("admin","user4",NOW(),"This is similar to the construction in most other Romance languages, and, to an extent, German, although Germans usually make less use of the informal forms. When addressing strangers or speaking about strangers, use the formal forms. ");

INSERT INTO messages(sender_id, receiver_id, submission_date,msg_data)
VALUES("user2","admin",NOW(),"Λογαριασμό οριοθετούν σου γυρίζοντας αποχωρήσει αποκάλυπτε αναβόσβησε έως. Χείλια θα ας ισχυρή τι έγιναν σήμερα στίχοι αν. Ακλόνητη ισχύουσα μοναδικό προφανώς φυλετικό διαθέτει εκ θα τα. ");
INSERT INTO messages(sender_id, receiver_id, submission_date,msg_data)
VALUES("user2","user1",NOW(),"Ίχνη μέλη όμως όσον με άλλο έν έναν πω. Μόνο για τον νερο πιο αυτό. Πολυφωνία και γεγονότος όλο στεγνώνει πώς δεδομένης παραλλαγή συμβάσεις. Άρα μάγο όροι αφού ραχά ενώ.");
INSERT INTO messages(sender_id, receiver_id, submission_date,msg_data)
VALUES("user2","user3",NOW(),"Είδους βιβλία κανόνα ποίηση πατέρα νέο συν. Αρ τίθενται δείχνουν το απαγωγέα θα νοημάτων σύμβασης τι. Διαχείριση ταυτότητάς δημιουργία θα χρειάζεται υπ νε να εκφραστικό.");
INSERT INTO messages(sender_id, receiver_id, submission_date,msg_data)
VALUES("user2","user4",NOW(),"Και ότι γύρω δίνω έρως όριο κόρη. Νου επί κυρ εξορίες πλαίσιο δεν παιδικά. Για πως χουμαρτζής μου ταυτότητάς συνειδήσει από. Των ένα του μάνου ράχαν που άποψη θλίψη πρώτη ψυχής. Αμφότερες χρειαστεί πιο αναγνώσει των τις. ");
INSERT INTO messages(sender_id, receiver_id, submission_date,msg_data)
VALUES("user2","user5",NOW(),"
Τα το πω ολίσθημα γεγονότα δυνάμεις εφ κάθαρσης. Τέλους καρδιά μυηθεί σο χτένας απ οι άλλοτε. Άρα ενός έχει τους ούτε απ΄ τύπο μέσω. Σημαντικά ενώ των επιστολές ευθυτενής
 σχολιάζει συχνότερα στη. Μία που νέα τρίτο σου σειρά επούλ. ");

INSERT INTO messages(sender_id, receiver_id, submission_date,msg_data)
VALUES("user3","user2",NOW(),"Είδους βιβλία κανόνα ποίηση πατέρα νέο συν. Αρ τίθενται δείχνουν το απαγωγέα θα νοημάτων σύμβασης τι. Διαχείριση ταυτότητάς δημιουργία θα χρειάζεται υπ νε να εκφραστικό.");

INSERT INTO messages(sender_id, receiver_id, submission_date,msg_data)
VALUES("user3","user2",NOW(),"Είδους βιβλία κανόνα ποίηση πατέρα νέο συν. Αρ τίθενται δείχνουν το απαγωγέα θα νοημάτων σύμβασης τι. Διαχείριση ταυτότητάς δημιουργία θα χρειάζεται υπ νε να εκφραστικό.");






#Create MESSAGE
INSERT INTO messages(sender_id, receiver_id, submission_date, msg_data)
VALUES("sender","receiver",NOW(),"Message body, max 259 characters");

#READ MESSAGE
SELECT sender_id AS "Sender", receiver_id AS "Receiver",msg_data AS "Message body",submission_date AS "Date sent" FROM messages
WHERE sender_id = "admin";

SELECT 

#UPDATE MESSAGE
UPDATE messages
SET receiver_id = "user5"
WHERE receiver_id = "user1";

#DELETE MESSAGE
DELETE FROM messages
WHERE 