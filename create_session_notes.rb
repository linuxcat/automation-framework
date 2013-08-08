require 'google_drive'

class DocumentCreator
  # To change this template use File | Settings | File Templates.

  def initialize(file_name, dir_list)
    session = GoogleDrive.login("fb2@nmqa.com", "nmqapass")
    @ws = session.create_spreadsheet(file_name).worksheets[0]
    @ws[2, 2] = 'Feature'
    @ws[2, 3] = 'Tester'
    @ws[2, 4] = 'Execute'
    @ws[2, 5] = 'Result'
    @ws[2, 6] = 'Session Notes'


    @ws[2, 9] = 'Features to be tested'
    @ws[3, 9] = 'Passed'
    @ws[4, 9] = '% Passed'
    @ws[5, 9] = 'Failed'
    @ws[6, 9] = '% Failed'


    @ws[2, 10] = '=COUNTIF(D3:D1048576,"Yes")'
    @ws[3, 10] = '=countif(E3:E100, "Pass")'
    @ws[4, 10] = '=100/J2*J3'
    @ws[5, 10] = '=countif(E3:E100, "Failed")'
    @ws[6, 10] = '=100/J2*J5'

    populate_regression_sheet(dir_list)

    @ws.save
  end

  def populate_regression_sheet(dir_list)
    features = Dir.entries(dir_list)
    start_cell = 2
    features.each do |feature|
      if feature != "." && feature != ".."
        puts feature
        start_cell += 1
        @ws[start_cell, 2] = feature
        @ws[start_cell, 4] = "Yes"
        @ws[start_cell, 5] = "Not Run"

      end

    end
  end



end

DocumentCreator.new("Sprint 8 Regression", "src/test/java/features/")