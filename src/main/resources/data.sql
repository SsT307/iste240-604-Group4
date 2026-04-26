CREATE DATABASE IF NOT EXISTS iste240;
use iste240;

DELETE FROM appointment;
DELETE FROM patient;

INSERT INTO patient (first_name, last_name, ethnicity) VALUES
                                                           ('Ahmed', 'Mohammad', 'Egyptian'),
                                                           ('Hamda', 'Alsuwaidi', 'Emirati'),
                                                           ('Omar', 'Khalil', 'Lebanese'),
                                                           ('Priya', 'Khan', 'Pakistani'),
                                                           ('Noora', 'Almansoori', 'Emirati'),
                                                           ('Yousef', 'Haddad', 'Jordanian'),
                                                           ('Sara', 'Rahman', 'Bangladeshi'),
                                                           ('Mariam', 'Alnuaimi', 'Emirati'),
                                                           ('Hassan', 'Farouk', 'Sudanese'),
                                                           ('Laila', 'Qureshi', 'Indian'),
                                                           ('Khaled', 'Nasser', 'Palestinian'),
                                                           ('Aisha', 'Belhaj', 'Moroccan'),
                                                           ('Rana', 'Yilmaz', 'Turkish'),
                                                           ('Faisal', 'Alotaibi', 'Saudi'),
                                                           ('Nadine', 'Khoury', 'Syrian');

INSERT INTO appointment (date, time, reason, emiratesid, doctorid, hospitalid) VALUES
                                                                                   ('2026-03-13', '09:00:00', 'Annual checkup', 1, 3, 1),
                                                                                   ('2026-03-14', '11:30:00', 'Follow-up visit', 2, 2, 3),
                                                                                   ('2026-03-16', '14:00:00', 'Blood test', 3, 1, 2),
                                                                                   ('2026-03-20', '08:30:00', 'Skin consultation', 4, 4, 4),
                                                                                   ('2026-03-22', '10:00:00', 'Migraine review', 5, 5, 5),
                                                                                   ('2026-03-24', '13:15:00', 'Allergy symptoms', 6, 6, 6),
                                                                                   ('2026-03-26', '15:45:00', 'Back pain follow-up', 7, 7, 7),
                                                                                   ('2026-03-28', '09:20:00', 'Eye irritation', 8, 8, 8),
                                                                                   ('2026-03-30', '16:10:00', 'Joint pain consult', 9, 9, 9),
                                                                                   ('2026-04-01', '12:00:00', 'Nutrition check', 10, 10, 10),
                                                                                   ('2026-04-03', '10:40:00', 'ENT evaluation', 11, 11, 11),
                                                                                   ('2026-04-05', '14:25:00', 'Stress management', 12, 12, 12),
                                                                                   ('2026-04-07', '08:50:00', 'Hormone panel review', 13, 13, 13),
                                                                                   ('2026-04-09', '11:05:00', 'Urinary discomfort', 14, 14, 14),
                                                                                   ('2026-04-11', '17:00:00', 'Emergency follow-up', 15, 15, 15);