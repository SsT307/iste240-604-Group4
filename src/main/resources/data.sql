CREATE DATABASE IF NOT EXISTS iste240;
USE iste240;

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

INSERT INTO medical_record (visit_date, visit_time, conditions, treatment_given, effective, emiratesid, hospitalid) VALUES
                                    ('2026-01-15', '09:00:00', 'Fever', 'Paracetamol', true, 784123456, 1),
                                    ('2026-02-10', '14:30:00', 'Back Pain', 'Physiotherapy', true, 784654321, 2),
                                    ('2026-03-05', '11:00:00', 'Flu', 'Rest and fluids', true, 784111222, 1),
                                    ('2026-04-01', '16:00:00', 'Diabetes checkup', 'Insulin adjustment', true, 784333444, 3),
                                    ('2026-01-20', '10:00:00', 'Hypertension', 'Blood pressure medication', true, 784555666, 4),
                                    ('2026-02-15', '13:00:00', 'Asthma', 'Inhaler prescribed', true, 784777888, 5),
                                    ('2026-03-10', '08:30:00', 'Broken Arm', 'Cast applied', true, 784999000, 6),
                                    ('2026-03-20', '15:00:00', 'Migraine', 'Pain relief medication', false, 784111333, 7),
                                    ('2026-04-05', '11:30:00', 'Allergies', 'Antihistamines', true, 784222444, 8),
                                    ('2026-04-10', '09:30:00', 'Chest Pain', 'ECG and monitoring', true, 784555777, 9);


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
