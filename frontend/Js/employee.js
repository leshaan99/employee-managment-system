function saveEmployee(){
    let name=$('#empname').val();
    let address=$('#empaddress').val();
    let number=$('#empnum').val()

    $.ajax({
        method: "POST",
        contentType: "application/json",
        url: "http://localhost:8080/api/employee/saveEmployee",
        async:true,
        data:JSON.stringify({
                "empId" : "",
                "empName" : name,
                "empAddress" : address,
                "empMNum" : number
        }),
        success:function(data){
            alert("Employee saved successfully")
        },
        error:function(xhr, exception){
            alert("Error")
        }
    })
}