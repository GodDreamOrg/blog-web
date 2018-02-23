var TableAdvanced = function () {

    var initTable1 = function() {

        /* 插入的具体内容 */
        function fnFormatDetails ( oTable, nTr )
        {
            var aData = oTable.fnGetData( nTr );
            var sOut = '<table width="100%">';
            sOut += '<tr><td>Platform(s):</td><td>'+aData[2]+'</td></tr>';

            sOut += '</table>';
             
            return sOut;
        }

        /*
         * 插入一个details 列
         */
        var nCloneTh = document.createElement( 'th' );
        var nCloneTd = document.createElement( 'td' );
        nCloneTd.innerHTML = '<input type="radio" name="kk">';
        $(nCloneTd).attr('rowspan','2');
         
        $('#sample_1 thead tr').each( function () {
            this.insertBefore( nCloneTh, this.childNodes[0] );
        } );
         
        $('#sample_1 tbody tr').each( function () {
            this.insertBefore(  nCloneTd.cloneNode( true ), this.childNodes[0] );
        } );
         
        /*
         * 初始化正常的一个table
         */
        var oTable = $('#sample_1').dataTable( {
            "aoColumnDefs": [
                {"bSortable": false, "aTargets": [ 0 ] }
            ],
            "aaSorting": [[1, 'asc']],
             "aLengthMenu": [
                [5, 15, 20, -1],
                [5, 15, 20, "All"] // change per page values here
            ],
            // set the initial value
            "iDisplayLength": 10,
        });

        jQuery('#sample_1_wrapper .dataTables_filter input').addClass("form-control input-small"); // modify table search input
        jQuery('#sample_1_wrapper .dataTables_length select').addClass("form-control input-small"); // modify table per page dropdown
        jQuery('#sample_1_wrapper .dataTables_length select').select2(); // initialize select2 dropdown
         


         //循环遍列插入
        $('#sample_1 tbody tr td').each(function(){
            var nTr = $(this).parents('tr')[0];
            //console.info(nTr);
            oTable.fnOpen( nTr, fnFormatDetails(oTable, nTr), 'details' );

        })



    }



    return {

       
        init: function () {
            
            if (!jQuery().dataTable) {
                return;
            }

            initTable1();
            
        }

    };

}();