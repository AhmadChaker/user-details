INSERT INTO USER_DETAIL (EMPLOYEE_ID, TITLE, FIRST_NAME, LAST_NAME, GENDER) VALUES
  ('0012345698','MR','AHMAD','CHAKER8','BMALE'),
  ('0012345691','MRB','AHMAD1','CHAKER1','AMALE'),
  ('0012345692','MRA','AHMAD2','CHAKER3','XMALE'),
  ('0012345693','MRZ','AHMAD3','CHAKER5','ZMALE'),
  ('0012345694','TEST1','TEST NAME','TEST LAST','TESTGENDER');

INSERT INTO ADDRESS(USER_ID, STREET, CITY, POSTCODE, STATE, COUNTRY) VALUES
  (1, '123 Fake Street', 'Sydney', '20010', 'NSW1', 'AUSTRALIA18'),
  (2, '4 Fake Street', 'Melb', '20001', 'NSW1', 'AUSTRALIA19'),
  (3, '6 Fake Street', 'Sydney4', '20001', 'NSW1', 'AUSTRALIA20'),
  (4, '8 Fake Street', 'Sydney5', '20001', 'NSW1', 'AUSTRALIA21'),
  (5, '9 Test Street', 'Test City', 'Test Code', 'Test State', 'Test Country');

INSERT INTO USER_AUTH(USERNAME, PASSWORD, AUTHORITIES) VALUES
  ('achaker', '$2a$10$Nlo0mCmWA/nYpSnFESNDCe4DRwsE2sWpUs00GDvln9dEOU/f6Md7S', 'ROLE_STANDARD'),
  ('achakerAdmin', '$2a$10$ydeotw8IjesaXVXMI5cbuuRMUXfqHnIIQ9/TDWxLEqXq6zzMaPQAW', 'ROLE_ADMIN');