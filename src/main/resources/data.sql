CREATE DATABASE IF NOT EXISTS iste240;
use iste240;

DELETE FROM appointment;
DELETE FROM patient;
DELETE FROM insurance;
DELETE FROM medical_record;
DELETE FROM hospital;
DELETE FROM doctor;

INSERT INTO hospital (name, owner) VALUES
                                       ('City Hospital', 'Government'),
                                       ('Dubai Medical Center', 'Private'),
                                       ('Al Zahra Hospital', 'Private'),
                                       ('Rashid Hospital', 'Government'),
                                       ('Mediclinic City Hospital', 'Private'),
                                       ('American Hospital Dubai', 'Private'),
                                       ('Latifa Hospital', 'Government'),
                                       ('Zayed Military Hospital', 'Government'),
                                       ('NMC Royal Hospital', 'Private'),
                                       ('Saudi German Hospital', 'Private');

INSERT INTO medical_record (visit_date, visit_time, conditions, treatment_given, effective, patientid, hospitalid) VALUES
                                    ('2026-01-15', '09:00:00', 'Fever', 'Paracetamol', true, 2, 1),
                                    ('2026-02-10', '14:30:00', 'Back Pain', 'Physiotherapy', true, 1, 2),
                                    ('2026-03-05', '11:00:00', 'Flu', 'Rest and fluids', true, 3, 1),
                                    ('2026-04-01', '16:00:00', 'Diabetes checkup', 'Insulin adjustment', true, 4, 3),
                                    ('2026-01-20', '10:00:00', 'Hypertension', 'Blood pressure medication', true, 5, 4),
                                    ('2026-02-15', '13:00:00', 'Asthma', 'Inhaler prescribed', true, 6, 5),
                                    ('2026-03-10', '08:30:00', 'Broken Arm', 'Cast applied', true, 7, 6),
                                    ('2026-03-20', '15:00:00', 'Migraine', 'Pain relief medication', false, 8, 7),
                                    ('2026-04-05', '11:30:00', 'Allergies', 'Antihistamines', true, 9, 8),
                                    ('2026-04-10', '09:30:00', 'Chest Pain', 'ECG and monitoring', true, 10, 9);


INSERT INTO doctor (first_name, last_name, speciality, hospitalid) VALUES
    ('Fatma', 'Alsuwaidi', 'Dentistry', 1),
    ('Tania', 'Aziz', 'Pediatrics', 2),
    ('Shaikha', 'Alhajri', 'Cardiologist', 3),
    ('Fatma', 'Almadani', 'Dermatologist', 4),
    ('Maryam', 'Almazrouei', 'Neurology', 5),
    ('Aisha', 'Alnuaimi', 'Orthopedics', 6),
    ('Noora', 'Alkaabi', 'Ophthalmology', 7),
    ('Hessa', 'Alfalasi', 'Gynecology', 8),
    ('Latifa', 'Almansoori', 'Psychiatry', 9),
    ('Maha', 'Alhashimi', 'General Medicine', 10),
    ('Reem', 'Alshamsi', 'ENT', 11),
    ('Salama', 'Alali', 'Radiology', 12),
    ('Amna', 'Alsuwaidi', 'Endocrinology', 13),
    ('Dana', 'Alhammadi', 'Urology', 14),
    ('Sara', 'Alketbi', 'Emergency Medicine', 15);
    
 INSERT INTO insurance (insurance_name) VALUES
                                           ('Sukoon Insurance'),
                                           ('Dubai Insurance Company'),
                                           ('Dubai National Insurance & Reinsurance'),
                                           ('Orient Insurance'),
                                           ('GIG Gulf Insurance'),
                                           ('Daman Health Insurance'),
                                           ('Takaful Emarat'),
                                           ('Salama Islamic Arab Insurance'),
                                           ('Oman Insurance Company'),
                                           ('Union Insurance Company'),
                                           ('Al Sagr National Insurance'),
                                           ('Emirates Insurance Company'),
                                           ('RAK Insurance'),
                                           ('Adamjee Insurance'),
                                           ('National General Insurance');

INSERT INTO patient (patient_id, emiratesid, first_name, last_name, ethnicity) VALUES
                                                                                   (1, 784123456, 'Ahmed', 'Mohammad', 'Egyptian'),
                                                                                   (2, 784654321, 'Hamda', 'Alsuwaidi', 'Emirati'),
                                                                                   (3, 784111222, 'Omar', 'Khalil', 'Lebanese'),
                                                                                   (4, 784333444, 'Priya', 'Khan', 'Pakistani'),
                                                                                   (5, 784555666, 'Noora', 'Almansoori', 'Emirati'),
                                                                                   (6, 784777888, 'Yousef', 'Haddad', 'Jordanian'),
                                                                                   (7, 784999000, 'Sara', 'Rahman', 'Bangladeshi'),
                                                                                   (8, 784111333, 'Mariam', 'Alnuaimi', 'Emirati'),
                                                                                   (9, 784222444, 'Hassan', 'Farouk', 'Sudanese'),
                                                                                   (10, 784555777, 'Laila', 'Qureshi', 'Indian'),
                                                                                   (11, 784888999, 'Khaled', 'Nasser', 'Palestinian'),
                                                                                   (12, 784123789, 'Aisha', 'Belhaj', 'Moroccan'),
                                                                                   (13, 784456012, 'Rana', 'Yilmaz', 'Turkish'),
                                                                                   (14, 784789345, 'Faisal', 'Alotaibi', 'Saudi'),
                                                                                   (15, 784012678, 'Nadine', 'Khoury', 'Syrian');

INSERT INTO appointment (date, time, reason, patientid, doctorid, hospitalid) VALUES
                                                                                   ('2026-03-13', '09:00:00', 'Annual checkup', 2, 1, 1),
                                                                                   ('2026-03-14', '11:30:00', 'Follow-up visit', 15, 2, 3),
                                                                                   ('2026-03-16', '14:00:00', 'Blood test', 13, 1, 2),
                                                                                   ('2026-03-20', '08:30:00', 'Skin consultation', 2, 3, 4),
                                                                                   ('2026-03-22', '10:00:00', 'Migraine review', 4, 2, 5),
                                                                                   ('2026-03-24', '13:15:00', 'Allergy symptoms', 7, 4, 1),
                                                                                   ('2026-03-26', '15:45:00', 'Back pain follow-up', 11, 1, 3),
                                                                                   ('2026-03-28', '09:20:00', 'Eye irritation', 14, 3, 2),
                                                                                   ('2026-03-30', '16:10:00', 'Joint pain consult', 1, 2, 4),
                                                                                   ('2026-04-01', '12:00:00', 'Nutrition check', 9, 4, 5),
                                                                                   ('2026-04-03', '10:40:00', 'ENT evaluation', 10, 1, 1),
                                                                                   ('2026-04-05', '14:25:00', 'Stress management', 4, 3, 3),
                                                                                   ('2026-04-07', '08:50:00', 'Hormone panel review', 5, 2, 2),
                                                                                   ('2026-04-09', '11:05:00', 'Urinary discomfort', 6, 4, 4),
                                                                                   ('2026-04-11', '17:00:00', 'Emergency follow-up', 8, 1, 5);

