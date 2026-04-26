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
                                                                                   ('2026-03-13', '09:00:00', 'Annual checkup', 784123456, 1, 1),
                                                                                   ('2026-03-14', '11:30:00', 'Follow-up visit', 784654321, 2, 3),
                                                                                   ('2026-03-16', '14:00:00', 'Blood test', 784111222, 1, 2),
                                                                                   ('2026-03-20', '08:30:00', 'Skin consultation', 784333444, 3, 4),
                                                                                   ('2026-03-22', '10:00:00', 'Migraine review', 784555666, 2, 5),
                                                                                   ('2026-03-24', '13:15:00', 'Allergy symptoms', 784777888, 4, 1),
                                                                                   ('2026-03-26', '15:45:00', 'Back pain follow-up', 784999000, 1, 3),
                                                                                   ('2026-03-28', '09:20:00', 'Eye irritation', 784111333, 3, 2),
                                                                                   ('2026-03-30', '16:10:00', 'Joint pain consult', 784222444, 2, 4),
                                                                                   ('2026-04-01', '12:00:00', 'Nutrition check', 784555777, 4, 5),
                                                                                   ('2026-04-03', '10:40:00', 'ENT evaluation', 784888999, 1, 1),
                                                                                   ('2026-04-05', '14:25:00', 'Stress management', 784123789, 3, 3),
                                                                                   ('2026-04-07', '08:50:00', 'Hormone panel review', 784456012, 2, 2),
                                                                                   ('2026-04-09', '11:05:00', 'Urinary discomfort', 784789345, 4, 4),
                                                                                   ('2026-04-11', '17:00:00', 'Emergency follow-up', 784012678, 1, 5);