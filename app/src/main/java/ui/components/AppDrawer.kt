package ui.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.topic2.android.notes.R
import com.topic2.android.notes.theme.NotesTheme

@Composable
private fun AppDrawerHeader(){
    Row(modifier = Modifier.fillMaxWidth()){
        Image(
            imageVector = Icons.Filled.Menu,
            contentDescription = "Drawer Header Icon",
            colorFilter = ColorFilter
                .tint(MaterialTheme.colors.onSurface),
            modifier = Modifier.padding(16.dp)
        )
        Text(
            stringResource(id = R.string.app_name),
            modifier = Modifier
                .align(alignment = Alignment.CenterVertically)
        )
    }
}
@Preview
@Composable
fun AppDrawerHeaderPreview(){
    NotesTheme{
        AppDrawerHeader()
    }
}