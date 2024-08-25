getAllEmployee()

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
            getAllEmployee()
        },
        error:function(xhr, exception){
            alert("Error")
        }
    })
}


function updateEmployee(){
    let id=$('#empid').val();
    let name=$('#empname').val();
    let address=$('#empaddress').val();
    let number=$('#empnum').val()

    $.ajax({
        method: "PUT",
        contentType: "application/json",
        url: "http://localhost:8080/api/employee/updateEmployee",
        async:true,
        data:JSON.stringify({
                "empId" : id,
                "empName" : name,
                "empAddress" : address,
                "empMNum" : number
        }),
        success:function(data){
            alert("Employee details updated")
            getAllEmployee()
        },
        error:function(xhr, exception){
            alert("Error")
        }
    })
}

function deleteEmployee(){
    let id=$('#empid').val();

    $.ajax({
        method: "DELETE",
        url: "http://localhost:8080/api/employee/deleteEmployee/"+id,
        async:true,
        success:function(data){
            alert("Employee deleted successfully")
            getAllEmployee()
        },
        error:function(xhr, exception){
            alert("Error")
        }
    })
}

function getAllEmployee(){

    $.ajax({
        method: "GET",
        url: "http://localhost:8080/api/employee/getAllEmployee",
        async:true,
        success:function(data){
            if (data.code==="00"){
                $('#empTable').empty();
                for (let emp of data.content){
                    let id=emp.empId;
                    let name=emp.empName;
                    let address=emp.empAddress;
                    let number=emp.empMNum;

                    var row = `<tr> <td>${id}</td> <td>${name}</td> <td>${address}</td> <td>${number}</td> </tr>`
                    $('#empTable').append(row);
                }
            }
        },
        error:function(xhr, exception){
            alert("Error")
        }
    })
}

function clearFields() {
    $('#empid').val('');
    $('#empname').val('');
    $('#empaddress').val('');
    $('#empnum').val('');
}

$(document).ready(function(){
    $(document).on('click', '#empTable tr', function (){
        var col0 = $(this).find('td:eq(0)').text();
        var col1 = $(this).find('td:eq(1)').text();
        var col2 = $(this).find('td:eq(2)').text();
        var col3 = $(this).find('td:eq(3)').text();

        $('#empid').val(col0);
        $('#empname').val(col1);
        $('#empaddress').val(col2);
        $('#empnum').val(col3);
    })
})