def group_by_marks(marks, pass_marks)
    # your code here
      marks.group_by {|name, score| score >= pass_marks ? :Passed : :Failed}
end



# Sample data
student_marks = {
  "John" => 85,
  "Jane" => 55,
  "Doe" => 90,
  "Smith" => 40
}

passing_marks = 60

# Call the function and display the results
puts group_by_marks(student_marks, passing_marks)
# puts "Students who Passed:"
# puts result[:Passed]
# puts "\nStudents who Failed:"
# puts result[:Failed]